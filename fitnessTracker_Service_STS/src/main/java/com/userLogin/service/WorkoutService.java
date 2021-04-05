package com.userLogin.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.userLogin.bean.WorkoutBean;
import com.userLogin.repo.WorkoutRepo;

@Service
public class WorkoutService {
	
	@Autowired
	com.userLogin.bean.WorkoutBean workouts;
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

//	Fetch by workoutname
	public WorkoutBean getWorkoutCalorie(String workoutName) {
		return repo.findByWorkoutName(workoutName);
	}

//	Update an already existing workoutId
	void updateWorkoutTime(WorkoutBean theWorkoutBean, int id) {
		repo.save(theWorkoutBean);
	}
}
