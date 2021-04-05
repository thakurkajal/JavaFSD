import { HttpClient } from '@angular/common/http';
import { Component, Input, OnInit } from '@angular/core';
import { DialogServiceService } from '../dialog/dialog-service.service';
import { PutServiceService } from '../put-service.service';
import { UserWorkout } from '../UserWorkout';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent implements OnInit {
  @Input () outputWorkout : any;
  @Input('workoutName') workoutName :any ;

  flag:any;

  @Input('workoutTime') workoutTime :any ;
  theWorkout : UserWorkout = new UserWorkout();

  title = 'Modal';
  responseWorkout: any;

  count: number=0;

  ngOnInit(){

  }
  constructor(private dialogService: DialogServiceService, private httpClient : HttpClient, private thePutService : PutServiceService){

  }
  
   showDialog(){
    this.dialogService.openDialog(
      {
        Name : this.outputWorkout.workoutName,
        Time : this.outputWorkout.workoutTime,
        
        title: "Workout Timer",
        body: "This is some body text"
      }
    ).then(result => {
      console.log("result");
    
    }, ()=>{

    }
    );
    this.flag="Done :) :)";
    console.log(this.outputWorkout.workoutName);
    this.getWorkout(this.outputWorkout.workoutName);
  }
 

 getWorkout(workoutName: any) : any{
  // console.log(workoutName);
  let responseUrl = this.httpClient.get("http://localhost:8080/workout/workout/" + workoutName);
    responseUrl.subscribe((responseData) => {
    this.responseWorkout = responseData;
    this.count=this.responseWorkout.averageCalorieBurn;
    // console.log(responseData);
    // console.log(this.outputWorkout);
    // console.log(this.count);
    this.putCalorie(this.outputWorkout);
  });
}

putCalorie(theWorkoutTime : any) {
  theWorkoutTime.caloriesBurnedByUser= this.count * this.outputWorkout.time;
  // console.log(theWorkoutTime);
  console.log(theWorkoutTime.caloriesBurnedByUser);
  let responseDataBack =  this.thePutService.updateStudentDetailsById(theWorkoutTime);
  
  responseDataBack.subscribe((responseData) =>{
    // console.log(responseData);
    console.log("Updated Student...");
  });
}

}




