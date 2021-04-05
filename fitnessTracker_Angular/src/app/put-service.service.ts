import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UserWorkout } from './UserWorkout';

@Injectable({
  providedIn: 'root'
})
export class PutServiceService {

  constructor(private httpClient : HttpClient) { }

  updateStudentDetailsById(theWorkoutTime: any){
    // console.log(theWorkoutTime.workoutId);
    // console.log(theWorkoutTime);
    // console.log(theWorkoutTime.id);
    return this.httpClient.put<UserWorkout>("http://localhost:8080/workout/workoutTime/"+theWorkoutTime.id,theWorkoutTime, theWorkoutTime.id);
    
  }
}
