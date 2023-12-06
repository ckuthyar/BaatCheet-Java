package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.EnrolmentCenterDao;
import com.sangamone.model.EnrolmentCenter;
import com.sangamone.repository.EnrolmentCenterRepo;
@Service
public class EnrolmentCenterServiceImpl implements EnrolmentCenterDao {
	@Autowired
	EnrolmentCenterRepo enrolmentcenterrepo;

	@Override
	public String addCenterDetails(EnrolmentCenter enrolmentcenter) {
		enrolmentcenterrepo.save(enrolmentcenter);
		return "Center Details added successfully";

}

	@Override
	public List<EnrolmentCenter> viewCentersDetails() {
		
		return enrolmentcenterrepo.findAll();
	}

	@Override
	public String approveCenter(EnrolmentCenter enrolmentcenter) {
		enrolmentcenterrepo.save(enrolmentcenter);
		return "Center approved";
	}

	@Override
	public String rejectCenter(EnrolmentCenter enrolmentcenter) {
		enrolmentcenterrepo.save(enrolmentcenter);
		return "Center rejected";
	}
	

	
}
