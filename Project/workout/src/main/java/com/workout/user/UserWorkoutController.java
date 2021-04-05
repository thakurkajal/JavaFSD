package com.workout.user;

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
import com.workout.bean.UserBean;
import com.workout.bean.WorkoutBean;

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
	
	@GetMapping("/{userWorkoutId}")
	public List<UserWorkoutBean> getUserWorkoutDetails(@PathVariable Integer userWorkoutId) {
		return service.getUserWorkoutDetails(userWorkoutId);
	}
	
	@DeleteMapping("/delete/{userWorkoutId}")
	public void delete(@PathVariable Integer userWorkoutId) {
		service.delete(userWorkoutId);
	}
	
//	@PostMapping("/calculate/{userWorkoutId}")
//	public void calculateCalories(@RequestBody UserWorkoutBean user, @PathVariable Integer userWorkoutId) {
//		user.setCaloriesBurnedByUser(userWorkoutId);
//		//workout.setAverageCalorieBurn(userWorkoutId);
//		service.calculateCalories(user, userWorkoutId);
//	}
}
