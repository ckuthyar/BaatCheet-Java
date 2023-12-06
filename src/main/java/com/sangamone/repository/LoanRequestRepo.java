package com.sangamone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.model.LoanRequest;

public interface LoanRequestRepo extends JpaRepository<LoanRequest, Integer>{

}
