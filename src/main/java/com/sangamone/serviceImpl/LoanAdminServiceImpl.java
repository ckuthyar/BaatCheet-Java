package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LoanAdminDao;
import com.sangamone.model.EnrolmentCenter;
import com.sangamone.model.EnrolmentCenterAdmin;
import com.sangamone.model.LoanAdmin;
import com.sangamone.repository.EnrolmentCenterRepo;
import com.sangamone.repository.LoanAdminRepo;
@Service
public class LoanAdminServiceImpl implements LoanAdminDao{
	@Autowired
	LoanAdminRepo loanAdminRepo;
	
	@Autowired
	EnrolmentCenterRepo enrolmentCenterRepo;

	@Override
	public String addAdminDetails(EnrolmentCenterAdmin enrolmentCenterAdmin) {
		String result="Enrolment Center not found";
		EnrolmentCenter enrolmentCenter=enrolmentCenterRepo.addUser(enrolmentCenterAdmin.getCenter_id());
		if(enrolmentCenter!=null) {
			LoanAdmin loanAdmin=new LoanAdmin();
			loanAdmin.setAdmin_name(enrolmentCenterAdmin.getAdmin_name());
			loanAdmin.setAdmin_email(enrolmentCenterAdmin.getAdmin_email());
			loanAdmin.setAdmin_aadhaar(enrolmentCenterAdmin.getAdmin_aadhaar());
			loanAdmin.setAdmin_phoneno(enrolmentCenterAdmin.getAdmin_phoneno());
			loanAdmin.setCenter_id(enrolmentCenter.getCenter_id());
			loanAdminRepo.save(loanAdmin);
			result="Admin details added successfully";
			
		}
		
		return result;
	}

	@Override
	public List<LoanAdmin> viewAllAdminDetails() {
		
		return loanAdminRepo.findAll();
	}

	@Override
	public List<LoanAdmin> viewAdminDetailsByCenterId(int center_id) {
		
		return loanAdminRepo.viewAdminDetailsByCenterId(center_id);
	}

}
