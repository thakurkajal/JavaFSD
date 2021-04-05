import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Workout } from '../Workout';

@Injectable({
  providedIn: 'root'
})
export class WorkoutService {
  constructor(private httpClient: HttpClient) { 

  }

  searchOnWorkout(sworkout) {
    sworkout = "show";
    return this.httpClient.get<Workout>("http://localhost:9092/workout/"+ sworkout);
  }

  //POST Method
  addNewWorkout(cWorkout) {
    return this.httpClient.post<Workout>("http://localhost:9092/workout/create", cWorkout);
  }

  //PUT Method
  updateWorkout(uWorkout) {
    return this.httpClient.put<Workout>("http://localhost:9092/workout/update", uWorkout);
  }

  // //DELETE Method
  deleteWorkout(dWorkout) {
    return this.httpClient.delete<Workout>("http://localhost:9092/workout/"+dWorkout.workoutName);
  }
}
