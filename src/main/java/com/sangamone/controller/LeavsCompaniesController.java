package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LeavsCompaniesDao;
import com.sangamone.model.LeavsCompanies;

@RestController
public class LeavsCompaniesController {
	@Autowired
	LeavsCompaniesDao leavsCompaniesDao;
	
	@PostMapping("/addLeavsCompany")
	public String addLeavsCompany(@RequestBody LeavsCompanies leavsCompanies) {
		return leavsCompaniesDao.addLeavsCompany(leavsCompanies);
	}
	
	@GetMapping("/viewLeavsCompanies")
	public List<LeavsCompanies> viewLeavsCompanies(){
		return leavsCompaniesDao.viewLeavsCompanies();
	}

}
