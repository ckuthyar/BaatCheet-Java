package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LoanUserDao;
import com.sangamone.model.EnrolmentCenter;
import com.sangamone.model.EnrolmentCenterUser;
import com.sangamone.model.LoanUser;
import com.sangamone.repository.EnrolmentCenterRepo;
import com.sangamone.repository.LoanUserRepo;

@Service
public class LoanUserServiceImpl implements LoanUserDao {
	@Autowired
	EnrolmentCenterRepo enrolmentCenterRepo;
	
	@Autowired
	LoanUserRepo loanUserRepo;

	@Override
	public String addUserDetails(EnrolmentCenterUser ecu) {
		String result="Enrolment Center not found";
		EnrolmentCenter ec = enrolmentCenterRepo.addUser(ecu.getCenter_id());
		if (ec!=null) {
			LoanUser loanuser = new LoanUser();
			loanuser.setName(ecu.getName());
			loanuser.setPhoneno(ecu.getPhoneno());
			loanuser.setAadhaar(ecu.getAadhaar());
			loanuser.setEmail(ecu.getEmail());
			loanuser.setCenter_id(ec.getCenter_id());
			loanUserRepo.save(loanuser);
			result="User details added successfully";
			
		}
		
		return result;
	}

	@Override
	public List<LoanUser> viewAllUserDetails() {
		return loanUserRepo.findAll();
	}

	@Override
	public List<LoanUser> viewUserDetailsByCenterId(int center_id) {
		return loanUserRepo.viewUserDetailsByCenter_id(center_id);
	}

}
