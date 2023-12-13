package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.CenterUserProductLoanRequest;
import com.sangamone.model.LoanRequest;

public interface LoanRequestDao {

	String addLoanRequest(CenterUserProductLoanRequest centerUserProductLoanRequest);

	List<LoanRequest> viewAllLoanRequest();

}
