package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.EnrolmentCenterUser;
import com.sangamone.model.LoanUser;

public interface LoanUserDao {





	String addUserDetails(EnrolmentCenterUser ecu) ;

	List<LoanUser> viewAllUserDetails();

	List<LoanUser> viewUserDetailsByCenterId(int center_id);


	

}
