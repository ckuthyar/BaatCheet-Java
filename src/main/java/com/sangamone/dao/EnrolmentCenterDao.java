package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.EnrolmentCenter;

public interface EnrolmentCenterDao {

	String addCenterDetails(EnrolmentCenter enrolmentcenter);

	List<EnrolmentCenter> viewCentersDetails();

	String approveCenter(EnrolmentCenter enrolmentcenter);

	String rejectCenter(EnrolmentCenter enrolmentcenter);
	
	

}
