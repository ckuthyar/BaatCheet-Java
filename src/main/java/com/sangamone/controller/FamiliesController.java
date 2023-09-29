package com.sangamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.model.Families;
import com.sangamone.repository.FamiliesRepo;

@RestController
public class FamiliesController {
	@Autowired
	FamiliesRepo familiesRepo;
	
	@PostMapping("/addFamily")
	public String addFamily(@RequestBody Families families) {
		familiesRepo.save(families);
		return "Success";
	}
	

}
