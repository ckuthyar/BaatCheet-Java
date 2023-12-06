package com.sangamone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sangamone.model.EnrolmentCenter;

public interface EnrolmentCenterRepo extends JpaRepository<EnrolmentCenter, Integer> {
	@Query(value="select * from enrolment_center where center_id=:center_id",nativeQuery=true)
	EnrolmentCenter addUser(int center_id);
	

}
