package com.workout.user;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserWorkoutRepo extends CrudRepository<UserWorkoutBean, Integer> {

	List<UserWorkoutBean> findByUserId(Integer userWorkoutId);
}