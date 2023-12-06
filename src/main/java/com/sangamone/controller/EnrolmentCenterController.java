package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.EnrolmentCenterDao;
import com.sangamone.model.EnrolmentCenter;

@RestController
public class EnrolmentCenterController {
	@Autowired
	EnrolmentCenterDao enrolmentcenterdao;
	
	@PostMapping("/addCenterDetails")
	public String addCenterDetails(@RequestBody EnrolmentCenter enrolmentcenter ) {
		return enrolmentcenterdao.addCenterDetails(enrolmentcenter);
	}
	@GetMapping("/viewCentersDetails")
	public List<EnrolmentCenter> viewCentersDetails(){
		return enrolmentcenterdao.viewCentersDetails();
	}
	@PutMapping("/approveCenter")
	public String approveCenter(@RequestBody EnrolmentCenter enrolmentcenter) {
		return enrolmentcenterdao.approveCenter(enrolmentcenter);
	}
	@PutMapping("/rejectCenter")
	public String rejectCenter(@RequestBody EnrolmentCenter enrolmentcenter) {
		return enrolmentcenterdao.rejectCenter(enrolmentcenter);
	}

}
