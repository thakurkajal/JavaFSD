package com.workout.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workout.bean.WorkoutBean;


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
