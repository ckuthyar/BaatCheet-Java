package com.sangamone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sangamone.model.LoanProduct;

public interface LoanProductRepo extends JpaRepository<LoanProduct, Integer>{
	@Query(value="select * from loanproduct where product_id=:product_id",nativeQuery=true)
	LoanProduct addRequest(@Param("product_id") int product_id);

}
