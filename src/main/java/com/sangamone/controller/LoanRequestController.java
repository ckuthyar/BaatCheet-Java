package com.sangamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LoanRequestDao;
import com.sangamone.model.CenterUserProductLoanRequest;

@RestController
public class LoanRequestController {
	@Autowired
	LoanRequestDao loanRequestDao;
	
	@PostMapping("/addLoanRequest")
	public String addLoanRequest(@RequestBody CenterUserProductLoanRequest centerUserProductLoanRequest) {
		return loanRequestDao.addLoanRequest(centerUserProductLoanRequest);
		
	}
	
	

}
