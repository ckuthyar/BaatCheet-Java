package com.sangamone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.model.Loan;

public interface LoanRepo extends JpaRepository<Loan, Integer>{
	

}
