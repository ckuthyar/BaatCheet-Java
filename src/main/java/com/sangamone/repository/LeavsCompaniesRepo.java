package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sangamone.model.LeavsCompanies;
import com.sangamone.model.LeavsUsers;

public interface LeavsCompaniesRepo extends JpaRepository<LeavsCompanies, Integer>{
	
	@Query(value="select * from leavs_companies where company_name=:company_name",nativeQuery=true)
	LeavsCompanies addLeavsUser(String company_name);
	
	

}
