package com.userLogin.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Formula;
import org.springframework.stereotype.Component;

@Entity
@Component
public class WorkoutBean {
	@Id
	String workoutName;
	String workoutDescription;
	Integer averageCalorieBurn;		
	
	
	public WorkoutBean() {
		
	}
	public WorkoutBean(String workoutName) {		
		this.workoutName = workoutName;
	}
	
	
	
	public String getWorkoutName() {
		return workoutName;
	}
	public void setWorkoutName(String workoutName) {
		this.workoutName = workoutName;
	}
	public String getWorkoutDescription() {
		return workoutDescription;
	}
	public void setWorkoutDescription(String workoutDescription) {
		this.workoutDescription = workoutDescription;
	}
	public Integer getAverageCalorieBurn() {
		return averageCalorieBurn;
	}
	public void setAverageCalorieBurn(Integer averageCalorieBurn) {
		this.averageCalorieBurn = averageCalorieBurn;
	}
}
