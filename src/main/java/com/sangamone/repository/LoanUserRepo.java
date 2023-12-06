package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sangamone.model.LoanUser;

public interface LoanUserRepo extends JpaRepository<LoanUser, Integer>{
	@Query(value="select * from loanuser where center_id=:center_id", nativeQuery=true)
	List<LoanUser> viewUserDetailsByCenter_id(int center_id);

	@Query(value="select * from loanuser where loanuser_id=:loanuser_id",nativeQuery=true)
	LoanUser addRequest(@Param("loanuser_id") int loanuser_id);

}
