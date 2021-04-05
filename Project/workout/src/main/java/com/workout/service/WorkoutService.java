package com.workout.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.workout.bean.WorkoutBean;
import com.workout.repo.WorkoutRepo;

@Service
public class WorkoutService {
	
	@Autowired
	WorkoutBean workouts;
	@Autowired
	WorkoutRepo repo;
	
	public void create(WorkoutBean workouts) {
		repo.save(workouts);
	}

	public List<WorkoutBean> show() {
		return (List<WorkoutBean>) repo.findAll();		
	}
	
	public void update(WorkoutBean workout) {
		repo.save(workout);
	}
	
	public void delete(WorkoutBean workoutName) {
		repo.delete(workoutName);
	}
}
