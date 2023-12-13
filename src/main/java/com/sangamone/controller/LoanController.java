package com.sangamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LoanDao;
import com.sangamone.model.UserProductLoan;

@RestController
public class LoanController {
	@Autowired
	LoanDao loanDao;
	
	@PostMapping("/addLoanSanctionDetails")
	public String addLoanSanctionDetails(@RequestBody UserProductLoan userProductLoan) {
    return loanDao.addLoanSanctionDetails(userProductLoan);
}
}