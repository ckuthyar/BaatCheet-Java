package com.sangamone.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.sangamone.model.EnrolmentCenterAdmin;
import com.sangamone.model.LoanAdmin;

public interface LoanAdminDao {

	String addAdminDetails(EnrolmentCenterAdmin enrolmentCenterAdmin);

	List<LoanAdmin> viewAllAdminDetails();

	List<LoanAdmin> viewAdminDetailsByCenterId(int center_id);

}
