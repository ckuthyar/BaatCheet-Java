package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sangamone.model.LoanAdmin;

public interface LoanAdminRepo extends JpaRepository<LoanAdmin, Integer>{
	@Query(value="select * from loanadmin where center_id=:center_id",nativeQuery=true)
	List<LoanAdmin> viewAdminDetailsByCenterId(@Param("center_id") int center_id);
	

}
