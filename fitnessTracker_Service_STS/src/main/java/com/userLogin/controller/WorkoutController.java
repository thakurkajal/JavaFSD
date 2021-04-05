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
import org.springframework.web.bind.annotation.RestController;
import com.userLogin.bean.WorkoutBean;
import com.userLogin.service.WorkoutService;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

	
	@Autowired
	WorkoutService service;
	
	
	@PostMapping("/create/show")
	public void create(@RequestBody WorkoutBean workouts) { 
		service.create(workouts);
	}
	
	@GetMapping("/show")
	public List<WorkoutBean> show() {
		return service.show();
	}
	
	@PutMapping("/update")
	public void update(@RequestBody WorkoutBean workout) {
		service.update(workout);
	}
	
	@DeleteMapping("/{workoutName}")
	void delete(@PathVariable WorkoutBean workoutName) {
		service.delete(workoutName);
	}
	
//	Get workout
	@RequestMapping("/workout/{workoutName}")
	WorkoutBean getWorkoutCalorie(@PathVariable String workoutName){
		return service.getWorkoutCalorie(workoutName);
	}
	
}
