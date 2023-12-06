package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LoanUserDao;
import com.sangamone.model.EnrolmentCenterUser;
import com.sangamone.model.LoanUser;

@RestController
public class LoanUserController {
	@Autowired
	LoanUserDao loanUserDao;
	
	@PostMapping("/addUserDetails")
	public String addUserDetails(@RequestBody EnrolmentCenterUser ecu) {
		return loanUserDao.addUserDetails(ecu);
	}
	
	@GetMapping("/viewAllUserDetails")
	public List<LoanUser> viewAllUserDetails(){
		return loanUserDao.viewAllUserDetails();
	}
	
	@GetMapping("/viewUserDetailsByCenterId/{center_id}")
	public List<LoanUser> viewUserDetailsByCenter_id(@PathVariable("center_id") int center_id){
		return loanUserDao.viewUserDetailsByCenterId(center_id);
	}

}
