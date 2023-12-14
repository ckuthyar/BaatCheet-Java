package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LoanDao;
import com.sangamone.model.EnrolmentCenter;
import com.sangamone.model.Loan;
import com.sangamone.model.LoanProduct;
import com.sangamone.model.LoanUser;
import com.sangamone.model.UserProductLoan;
import com.sangamone.repository.EnrolmentCenterRepo;
import com.sangamone.repository.LoanProductRepo;
import com.sangamone.repository.LoanRepo;
import com.sangamone.repository.LoanUserRepo;

@Service
public class LoanServiceImpl implements LoanDao {
	@Autowired
	LoanRepo loanRepo;
	
	@Autowired
	EnrolmentCenterRepo enrolmentCenterRepo;
	
	@Autowired
	LoanUserRepo loanUserRepo;
	
	@Autowired
	LoanProductRepo loanProductRepo;
	
	@Override
	public String addLoanSanctionDetails(UserProductLoan userProductLoan) {
		String result="Details not found";
		EnrolmentCenter enrolmentCenter = enrolmentCenterRepo.addUser(userProductLoan.getCenter_id());
		LoanUser loanUser=loanUserRepo.addRequest(userProductLoan.getLoanuser_id());
		LoanProduct loanProduct=loanProductRepo.addRequest(userProductLoan.getProduct_id());
		if(enrolmentCenter!=null && loanProduct!=null) {
			Loan loan=new Loan();
			loan.setCenter_id(enrolmentCenter.getCenter_id());
			loan.setFrom_user_id(loanUser.getLoanuser_id());
			loan.setTo_user_id(loanUser.getLoanuser_id());
			loan.setProduct_id(loanProduct.getProduct_id());
			loan.setCommission(userProductLoan.getCommission());
			loanRepo.save(loan);
			result="Loan Sanction Details added successfully";
		}
		return result;

	}

	@Override
	public List<Loan> viewAllLoanDetails() {
		
		return loanRepo.findAll();
	}

	@Override
	public List<Loan> viewLoanSanctionDetailsByUserId(int from_user_id, int to_user_id) {
		return loanRepo.viewLoanSanctionDetailsByUserId(from_user_id, to_user_id);
	}

	@Override
	public List<Loan> viewLoanSanctionDetailsByCenterId(int center_id) {
		return loanRepo.viewLoanSanctionDetailsByCenterId(center_id);
	}
	

}
