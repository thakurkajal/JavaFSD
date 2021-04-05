package com.userLogin.bean;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Component
public class LogBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer num;
	@ManyToOne
	UserBean user;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	Date start;
	
	Integer userWorkoutId;
	Integer caloriesBurnedByUser;
	Integer workoutTime;
	@Transient
	@JsonFormat(pattern = "yyyy-MM-dd")
	Date from;
	
	@Transient
	@JsonFormat(pattern = "yyyy-MM-dd")
	Date to;

	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	
	public Integer getUserWorkoutId() {
		return userWorkoutId;
	}
	public void setUserWorkoutId(Integer userWorkoutId) {
		this.userWorkoutId = userWorkoutId;
	}
	public Integer getCaloriesBurnedByUser() {
		return caloriesBurnedByUser;
	}
	public void setCaloriesBurnedByUser(Integer caloriesBurnedByUser) {
		this.caloriesBurnedByUser = caloriesBurnedByUser;
	}
	public Integer getWorkoutTime() {
		return workoutTime;
	}
	public void setWorkoutTime(Integer workoutTime) {
		this.workoutTime = workoutTime;
	}
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start =start;
	}
	@Override
	public String toString() {
		return "LogBean [num=" + num + ", user=" + user + ", start=" + start + ", userWorkoutId=" + userWorkoutId
				+ ", caloriesBurnedByUser=" + caloriesBurnedByUser + ", workoutTime=" + workoutTime + ", from=" + from
				+ ", to=" + to + "]";
	}
	
	
	
	
	
	

}
