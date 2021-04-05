package com.userLogin.repo;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.userLogin.bean.UserBean;


@Repository
public interface UserRepo  extends CrudRepository<UserBean,Integer>{
	
	
	@Query(nativeQuery = true, value = "select fullName from UserBean")
	List<String> getOnlyUsers();
	
	
	
	@Query(nativeQuery = true, value = "select phoneNumber from UserBean")
	public List<String> getAllPhoneNumbers();
	
	List<UserBean> findByFullName(String userName);

}