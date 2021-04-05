package com.userLogin.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userLogin.bean.LogBean;
import com.userLogin.repo.LogRepo;



@Service
public class LogService {
	
	@Autowired
	LogRepo repo;
	@Autowired
	List<LogBean> logBeans;

	public LogBean addEntryToLog(LogBean logBean) {
		return repo.save(logBean);
	}

	 public java.util.List<LogBean> getLogByUserID(Integer userId) {
		return repo.findByUserId(userId);
	}

	public List<LogBean> getLogByUserWorkoutId(Integer userWorkoutId) {
		
		return repo.findByUserWorkoutId(userWorkoutId);
	}

	public List<LogBean> getEntryByDate(Date start, Integer id) {
		
		
		 return  repo.findByStartAndUserId(start,id);
	}

	public List<LogBean> getInfoFromTo(LogBean logbean, Integer id) { 
	
		 
		for (Date date = logbean.getFrom(); !DateUtils.isSameDay(date, logbean.getTo()); ) {
			if(!DateUtils.isSameDay(date, logbean.getFrom())) {
			List<LogBean> ByOneDate =repo.findByStartAndUserId(date,id);
			logBeans.addAll( ByOneDate);
			}
			else
			logBeans =repo.findByStartAndUserId(logbean.getFrom(),id);
				date = DateUtils.addDays(date, 1);
		}
		
		List<LogBean> ByOneDate =repo.findByStartAndUserId(logbean.getTo(),id);
		logBeans.addAll( ByOneDate);
		return logBeans;

	}
	
	
	
}

