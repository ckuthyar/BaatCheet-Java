package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.LoanProduct;

public interface LoanProductDao {

	String addLoanProduct(LoanProduct loanProduct);

	List<LoanProduct> viewAllLoanProducts();

}
