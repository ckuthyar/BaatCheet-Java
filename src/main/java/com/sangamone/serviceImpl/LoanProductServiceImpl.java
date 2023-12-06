package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LoanProductDao;
import com.sangamone.model.LoanProduct;
import com.sangamone.repository.LoanProductRepo;
@Service
public class LoanProductServiceImpl implements LoanProductDao {
	@Autowired
	LoanProductRepo loanProductRepo;

	@Override
	public String addLoanProduct(LoanProduct loanProduct) {
		loanProductRepo.save(loanProduct);
		return "Loan Product added successfully";
	}

	@Override
	public List<LoanProduct> viewAllLoanProducts() {
		
		return loanProductRepo.findAll();
	}

}
