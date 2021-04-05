
package com.userLogin.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.userLogin.bean.WorkoutBean;


@Repository
public interface WorkoutRepo extends CrudRepository<WorkoutBean, String> {

	WorkoutBean findByWorkoutName(String workoutName);

}
