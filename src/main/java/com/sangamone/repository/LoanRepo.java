package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sangamone.model.Loan;

public interface LoanRepo extends JpaRepository<Loan, Integer>{
	@Query(value="select * from loan where from_user_id=:from_user_id or to_user_id=:to_user_id",nativeQuery=true)
	List<Loan> viewLoanSanctionDetailsByUserId(@Param("from_user_id") int from_user_id, @Param("to_user_id") int to_user_id);
	
	@Query(value="select * from loan where center_id=:center_id",nativeQuery=true)
	List<Loan> viewLoanSanctionDetailsByCenterId(@Param("center_id") int center_id);
	
	

}
