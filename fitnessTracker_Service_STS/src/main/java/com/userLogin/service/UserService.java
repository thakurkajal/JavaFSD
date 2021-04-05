package com.userLogin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userLogin.bean.UserBean;
import com.userLogin.repo.UserRepo;


@Service
public class UserService {


 @Autowired
 UserRepo repo;

 
 public boolean create(UserBean userbean) {
	  
	  boolean isPhoneNumberUsed = this.searchForPhoneNumber(userbean.getPhoneNumber());
	  if(!isPhoneNumberUsed) {
		Integer h= userbean.getHeight();
	Double w= userbean.getWeight();
	Double b=(100*100*w)/(h*h);
	userbean.setBmi(b);	
	 repo.save(userbean);
	  }
	  System.out.println("PhoneNumber already used");
	 return isPhoneNumberUsed;
}

 public boolean searchForPhoneNumber(String phoneNumber) {
	  boolean isPhoneNumberUsed = false;
	  List<String> listOfPhoneNumbers = repo.getAllPhoneNumbers();

	for(String  phoneNumberr : listOfPhoneNumbers) {
		if(phoneNumberr.equals(phoneNumber)) {
			isPhoneNumberUsed = true;
		}
	}
	 
	return isPhoneNumberUsed;
	
}
   public void update(UserBean bean,int id) {
	   bean.setId(id);
	 repo.save(bean);
 }
  public List<UserBean> getDeatilsByname(String username) {
	 return (List<UserBean>) repo.findByFullName(username);
}public List<UserBean> getAllUsers() {
	// TODO Auto-generated method stub
	return (List<UserBean>) repo.findAll();
}

public List<String> getDetailsOfUsers() {
	// TODO Auto-generated method stub
	return (List<String>) repo.getOnlyUsers();
}
//Fetch user by id    
public Optional<UserBean> getUserById(int id) {   /* only this is added */
  return repo.findById(id);
}
}







