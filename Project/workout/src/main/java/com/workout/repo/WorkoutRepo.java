
package com.workout.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.workout.bean.WorkoutBean;


@Repository
public interface WorkoutRepo extends CrudRepository<WorkoutBean, String> {

}
