import { Component, OnInit } from '@angular/core';
import { Workout } from '../Workout';
import { WorkoutService } from '../workout.service';



@Component({
  selector: 'app-workout',
  templateUrl: './workout.component.html',
  styleUrls: ['./workout.component.css']
})
export class WorkoutComponent implements OnInit {

  sWorkout: Workout = new Workout();
  cWorkout: Workout = new Workout();
  uWorkout: Workout = new Workout();
  dWorkout: Workout = new Workout();

  flag: boolean = false;
  addFlag: boolean = false;

  constructor(private theWorkoutValue: WorkoutService) { }

  ngOnInit(): void {
  }

  submitAddRequest(){
    this.addFlag=!this.addFlag;
  }

  searchOnWorkout(){
    let responseDataBack =  this.theWorkoutValue.searchOnWorkout(this.sWorkout);
    
    responseDataBack.subscribe((responseData) =>{
      this.sWorkout=responseData;
      console.log(responseData);  
      this.flag = true;    
    });
  } 


  //POST Method
  addNewWorkout(){
    let responseDataBack =  this.theWorkoutValue.addNewWorkout(this.cWorkout);
    
    responseDataBack.subscribe((responseData) =>{
      console.log("New Workout Added...");      
    });
  }


  //PUT Method
  updateWorkout(){
    let responseDataBack =  this.theWorkoutValue.updateWorkout(this.uWorkout);
    
    responseDataBack.subscribe((responseData) =>{
      console.log("Workout Updated...");
      
    });
  }

//   //DELETE Method
  deleteWorkout(){
    //create the url for search
    let responseDataBack =  this.theWorkoutValue.deleteWorkout(this.dWorkout);
    
    responseDataBack.subscribe((responseData) =>{
      console.log("Workout Deleted...");
      
    });
  }
}
