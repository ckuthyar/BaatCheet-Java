package com.sangamone.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.sangamone.model.Pincode;

public interface PincodeRepo extends JpaRepository<Pincode, Integer> {

}
