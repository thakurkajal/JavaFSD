package com.workout.controller;

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
import com.workout.bean.WorkoutBean;
import com.workout.service.WorkoutService;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

	
	@Autowired
	WorkoutService service;
	
	
	@PostMapping("/create")
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
	void deleteEmployee(@PathVariable WorkoutBean workoutName) {
		service.delete(workoutName);
	}
	
}
