package com.sangamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LeavsLeaveDao;
import com.sangamone.model.LeavsLeave;

@RestController
public class LeavsLeaveController {
	@Autowired
	LeavsLeaveDao leavsLeaveDao;
	
	@PostMapping("/applyLeave")
	public String applyLeave(@RequestBody LeavsLeave leavsLeave) {
		return leavsLeaveDao.applyLeave(leavsLeave);
	}
	
	 @PutMapping("/approveLeave") 
	 public String approveLeave(@RequestBody LeavsLeave leavsLeave){ 
		 return leavsLeaveDao.approveLeave(leavsLeave);
	 }
	 
	 @PutMapping("/cancelLeave") 
	 public String cancelLeave(@RequestBody LeavsLeave leavsLeave){ 
		 return leavsLeaveDao.cancelLeave(leavsLeave);
	 }
	 
	 @PutMapping("/withdrawLeave") 
	 public String withdrawLeave(@RequestBody LeavsLeave leavsLeave){ 
		 return leavsLeaveDao.withdrawLeave(leavsLeave);
	 }
	

}
