import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UserWorkout } from './UserWorkout';

@Injectable({
  providedIn: 'root'
})
export class WorkoutANDuserService {

  constructor(private httpClient: HttpClient) { 

  }

  searchOnWorkout(sWorkout) {
    sWorkout = "show";
    return this.httpClient.get<UserWorkout>("http://localhost:8080/user/"+ sWorkout);
  }

  searchOnWorkoutById(idWorkout) {
    return this.httpClient.get<UserWorkout>("http://localhost:8080/user/"+ idWorkout);
  }

  //POST Method
  addNewWorkout(cWorkout,id) {
    return this.httpClient.post<UserWorkout>("http://localhost:8080/user/create/"+id, cWorkout);
  }

  //PUT Method
  updateWorkout(uWorkout,id) {
    return this.httpClient.put<UserWorkout>("http://localhost:8080/user/updateWorkout/"+id, uWorkout);
  }

  // //DELETE Method
  deleteWorkout(dWorkout) {
    return this.httpClient.delete<UserWorkout>("http://localhost:8080/user/delete/"+dWorkout.workoutName);
  }
}
