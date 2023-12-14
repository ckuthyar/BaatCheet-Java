package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LoanDao;
import com.sangamone.model.Loan;
import com.sangamone.model.UserProductLoan;

@RestController
public class LoanController {
	@Autowired
	LoanDao loanDao;
	
	@PostMapping("/addLoanSanctionDetails")
	public String addLoanSanctionDetails(@RequestBody UserProductLoan userProductLoan) {
    return loanDao.addLoanSanctionDetails(userProductLoan);
}
	
	@GetMapping("/viewAllLoanSanctionDetails")
	public List<Loan> viewAllLoanDetails(){
		return loanDao.viewAllLoanDetails();
	}
	
	@GetMapping("/viewLoanSanctionDetailsByUserId/{from_user_id}/{to_user_id}")
	public List<Loan> viewLoanSanctionDetailsByUserId(@PathVariable("from_user_id") int from_user_id, @PathVariable("to_user_id") int to_user_id){
		return loanDao.viewLoanSanctionDetailsByUserId(from_user_id,to_user_id);
	}
	
	@GetMapping("/viewLoanSanctionDetailsByCenterId/{center_id}")
	public List<Loan> viewLoanSanctionDetailsByCenterId(@PathVariable("center_id") int center_id){
		return loanDao.viewLoanSanctionDetailsByCenterId(center_id);
	}
	
}