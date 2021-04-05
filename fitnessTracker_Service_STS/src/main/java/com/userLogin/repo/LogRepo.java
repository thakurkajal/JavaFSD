package com.userLogin.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.userLogin.bean.LogBean;


@Repository
@EnableJpaRepositories
public interface LogRepo extends CrudRepository<LogBean, Integer> {
	

	List<LogBean> findByUserId(Integer userId);

	List<LogBean> findByUserWorkoutId(Integer userWorkoutId);

	List<LogBean> findByStartAndUserId(Date start,Integer userId);


//	 findByUserId(Integer userId);
	
} 
