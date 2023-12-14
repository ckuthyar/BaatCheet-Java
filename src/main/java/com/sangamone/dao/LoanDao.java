package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.Loan;
import com.sangamone.model.UserProductLoan;

public interface LoanDao {

	String addLoanSanctionDetails(UserProductLoan userProductLoan);

	List<Loan> viewAllLoanDetails();

	List<Loan> viewLoanSanctionDetailsByUserId(int from_user_id, int to_user_id);

	List<Loan> viewLoanSanctionDetailsByCenterId(int center_id);

}
