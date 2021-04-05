package com.userLogin.bean;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;

import org.hibernate.annotations.Formula;
import org.springframework.stereotype.Component;
import com.userLogin.bean.UserBean;

@Entity
@Component
public class UserWorkoutBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer userWorkoutId;
	Integer workoutTime;
	String workoutName;	
	Integer caloriesBurnedByUser;
	
//	@Transient
//	Integer averageCalorieBurn;
//	
	@ManyToOne
	UserBean user;
//
//	
//	public Integer getAverageCalorieBurn() {
//		return averageCalorieBurn;
//	}
//
//	public void setAverageCalorieBurn(Integer averageCalorieBurn) {
//		this.averageCalorieBurn = averageCalorieBurn;
//	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}
	
	
	

	public Integer getUserWorkoutId() {
		return userWorkoutId;
	}

	public void setUserWorkoutId(Integer userWorkoutId) {
		this.userWorkoutId = userWorkoutId;
	}

	public Integer getWorkoutTime() {
		return workoutTime;
	}

	public void setWorkoutTime(Integer workoutTime) {
		this.workoutTime = workoutTime;
	}

	public String getWorkoutName() {
		return workoutName;
	}

	public void setWorkoutName(String workoutName) {
		this.workoutName = workoutName;
	}

	public Integer getCaloriesBurnedByUser() {
		return caloriesBurnedByUser;
	}

	public void setCaloriesBurnedByUser(Integer caloriesBurnedByUser) {
		this.caloriesBurnedByUser = caloriesBurnedByUser;
	}
}