package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LoanRequestDao;
import com.sangamone.model.CenterUserProductLoanRequest;
import com.sangamone.model.EnrolmentCenter;
import com.sangamone.model.LoanProduct;
import com.sangamone.model.LoanRequest;
import com.sangamone.model.LoanUser;
import com.sangamone.repository.EnrolmentCenterRepo;
import com.sangamone.repository.LoanProductRepo;
import com.sangamone.repository.LoanRequestRepo;
import com.sangamone.repository.LoanUserRepo;

@Service
public class LoanRequestServiceImpl implements LoanRequestDao{
	@Autowired
	LoanRequestRepo loanRequestRepo;
	
	@Autowired
	EnrolmentCenterRepo enrolmentCenterRepo;
	
	@Autowired
	LoanUserRepo loanUserRepo;
	
	@Autowired
	LoanProductRepo loanProductRepo;

	@Override
	public String addLoanRequest(CenterUserProductLoanRequest centerUserProductLoanRequest) {
		String result="Details not found";
		EnrolmentCenter enrolmentCenter = enrolmentCenterRepo.addUser(centerUserProductLoanRequest.getCenter_id());
		LoanUser loanUser = loanUserRepo.addRequest(centerUserProductLoanRequest.getLoanuser_id());
		LoanProduct loanProduct = loanProductRepo.addRequest(centerUserProductLoanRequest.getProduct_id());
		if(enrolmentCenter!=null && loanUser!=null && loanProduct!=null) {
			LoanRequest loanRequest=new LoanRequest();
			loanRequest.setCenter_id(enrolmentCenter.getCenter_id());
			loanRequest.setLoanuser_id(loanUser.getLoanuser_id());
			loanRequest.setProduct_id(loanProduct.getProduct_id());
			loanRequestRepo.save(loanRequest);
			result="Loan Request added successfully";
		}
		
		return result;
	}

	@Override
	public List<LoanRequest> viewAllLoanRequest() {
		
		return loanRequestRepo.findAll();
	}
	

}
