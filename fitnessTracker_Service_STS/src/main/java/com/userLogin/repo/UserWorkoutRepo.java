package com.userLogin.repo;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.userLogin.bean.UserWorkoutBean;


@Repository
public interface UserWorkoutRepo extends CrudRepository<UserWorkoutBean, Integer> {

	List<UserWorkoutBean> findByUserId(Integer userWorkoutId);

	List<UserWorkoutBean> findByWorkoutName(String workout);
}