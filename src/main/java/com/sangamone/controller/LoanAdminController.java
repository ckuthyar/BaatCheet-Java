package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LoanAdminDao;
import com.sangamone.model.EnrolmentCenterAdmin;
import com.sangamone.model.LoanAdmin;

@RestController
public class LoanAdminController {
	
	@Autowired
	LoanAdminDao loanAdminDao;
	
	@PostMapping("/addAdminDetails")
	public String addAdminDetails(@RequestBody EnrolmentCenterAdmin enrolmentCenterAdmin) {
		return loanAdminDao.addAdminDetails(enrolmentCenterAdmin);
	}
	
	@GetMapping("/viewAllAdminDetails")
	public List<LoanAdmin> viewAllAdminDetails(){
		return loanAdminDao.viewAllAdminDetails();
	}
	
	@GetMapping("/viewAdminDetailsByCenterId/{center_id}")
	public List<LoanAdmin> viewAdminDetailsByCenterId(@PathVariable("center_id")int center_id){
		return loanAdminDao.viewAdminDetailsByCenterId(center_id);
	}

}
