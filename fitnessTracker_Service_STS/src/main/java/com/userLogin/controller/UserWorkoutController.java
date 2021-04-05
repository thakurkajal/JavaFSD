package com.userLogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.userLogin.bean.UserWorkoutBean;
import com.userLogin.service.UserWorkoutService;

import com.userLogin.bean.UserBean;

@RestController
@RequestMapping("/user")
public class UserWorkoutController {
	
	@Autowired
	UserWorkoutService service;
	
	@PostMapping("/create/{id}")
	public void createUserWorkoutDetails(@RequestBody UserWorkoutBean workout, @PathVariable Integer id) {
		workout.setUser(new UserBean(id));
		service.createUserWorkoutDetails(workout);
	}
	
	@PutMapping("/updateWorkout/{idOfUser}")
	public void updateUserWorkoutDetailsById(@RequestBody UserWorkoutBean workout, @PathVariable Integer idOfUser) {
		workout.setUserWorkoutId(idOfUser);
		service.updateUserWorkoutDetailsById(workout);
	}
	
	@GetMapping("/show")
	public List<UserWorkoutBean> getAllUserWorkoutDetails() {
		return service.getAllUserWorkoutDetails();
	}
	
	@GetMapping("/{userId}")
	public List<UserWorkoutBean> getUserWorkoutDetails(@PathVariable Integer userId) {
		return service.getUserWorkoutDetails(userId);
	}
	
	@DeleteMapping("/delete/{userWorkoutId}")
	public void delete(@PathVariable Integer userWorkoutId) {
		service.delete(userWorkoutId);
	}
	
//	Get user
	@RequestMapping("/user/userId/{id}")
	List<UserWorkoutBean> getUserId(@PathVariable Integer id){
		return service.getUserId(id);
	}
	
//	Get workoutTime
	@RequestMapping("/workout/{workout}")
	List<UserWorkoutBean> getWorkout(@PathVariable String workout){
		return service.getWorkout(workout);
	}
	
//	Update an already existing workoutTime calorie
	@PutMapping("/workoutTime/{id}")
	void updateWorkoutTime(@RequestBody UserWorkoutBean theWorkoutTime,@PathVariable int id) {
		service.updateWorkoutTime(theWorkoutTime, id);
	}
}
