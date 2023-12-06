package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LoanProductDao;
import com.sangamone.model.LoanProduct;

@RestController
public class LoanProductController {
	@Autowired
	LoanProductDao loanProductDao;
	
	@PostMapping("/addLoanProduct")
	public String addLoanProduct(@RequestBody LoanProduct loanProduct) {
		return loanProductDao.addLoanProduct(loanProduct);
	}
	
	@GetMapping("/viewAllLoanProducts")
	public List<LoanProduct> viewAllLoanProducts(){
		return loanProductDao.viewAllLoanProducts();
	}

}
