package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LeavsUsersDao;
import com.sangamone.model.LeavsCompaniesUsers;
import com.sangamone.model.LeavsUsers;

@RestController
public class LeavsUsersController {
	@Autowired
	LeavsUsersDao leavsUsersDao;
	
	@PostMapping("/addLeavsUser")
	public String addLeavsUser(@RequestBody LeavsCompaniesUsers leavsCompaniesUsers) {
		return leavsUsersDao.addLeavsUser(leavsCompaniesUsers);
	}
	
	@GetMapping("/viewLeavsUsers")
	public List<LeavsUsers> viewLeavsUsers(){
		return leavsUsersDao.viewLeavsUsers();
	}
	@GetMapping("/viewLeavsUsersByCompanyId/{company_id}")
	public List<LeavsUsers> viewLeavsUsersByCompanyId(@PathVariable("company_id") int company_id){
		return leavsUsersDao.viewLeavsUsersByCompanyId(company_id);
	}
	
	@GetMapping("/viewLeavsUsersByUserId/{user_id}")
	public LeavsUsers viewLeavsUsersByUserId(@PathVariable("user_id") int user_id){
		return leavsUsersDao.viewLeavsUsersByUserId(user_id);
	}
	@GetMapping("/viewLeavsUsersByUserRole/{user_role}")
	public List<LeavsUsers> viewLeavsUsersByUserRole(@PathVariable("user_role") String user_role){
		return leavsUsersDao.viewLeavsUsersByUserRole(user_role);
	}
	
	@GetMapping("/viewLeavsUsersByCompanyIdRole/{company_id}/{user_role}")
	public List<LeavsUsers> viewLeavsUsersByCompanyIdRole(@PathVariable("company_id") int company_id, @PathVariable("user_role") String user_role){
		return leavsUsersDao.viewLeavsUsersByCompanyIdRole(company_id, user_role);
	}

}
