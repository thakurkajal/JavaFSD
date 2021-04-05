package com.userLogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userLogin.bean.UserWorkoutBean;
import com.userLogin.repo.UserWorkoutRepo;



@Service
public class UserWorkoutService {
	
	@Autowired
	UserWorkoutBean workout;
	@Autowired
	UserWorkoutRepo repo;
	

	public void createUserWorkoutDetails(UserWorkoutBean workout) {
		repo.save(workout);
	}

	public void updateUserWorkoutDetailsById(UserWorkoutBean workout2) {
		repo.save(workout2);
		
	}

	public List<UserWorkoutBean> getAllUserWorkoutDetails() {
		return( List<UserWorkoutBean>) repo.findAll();
	}

	public List<UserWorkoutBean> getUserWorkoutDetails(Integer userWorkoutId) {
		return( List<UserWorkoutBean>) repo.findByUserId(userWorkoutId);
	}

	public void delete(Integer userWorkoutId) {
		repo.deleteById(userWorkoutId);		
	}

	//	Update an already existing workoutTime
	public void updateWorkoutTime(UserWorkoutBean theWorkoutTime, int id) {
		repo.save(theWorkoutTime);
	}

	public List<UserWorkoutBean> getUserId(Integer id) {
		return (List<UserWorkoutBean>) repo.findByUserId(id);
	}

	public List<UserWorkoutBean> getWorkout(String workout) {
		return (List<UserWorkoutBean>) repo.findByWorkoutName(workout);
	}


//	public void calculateCalories(UserWorkoutBean user, WorkoutBean workout) {
//		Integer calories = user.getWorkoutTime() * workout.getAverageCalorieBurn();
//		repo.save(user);
//	}
	
//	public void calculateCalories(UserWorkoutBean user, Integer userWorkoutId) {
//		if(repo.existsById(userWorkoutId)) {
//			user.setCaloriesBurnedByUser(user.getWorkoutTime() * user.getAverageCalorieBurn());
//			repo.save(user);
//		}
//	}
}
