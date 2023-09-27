package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.model.Pincode;
import com.sangamone.repository.PincodeRepo;

@RestController
public class PincodeController {
	@Autowired
	PincodeRepo pincodeRepo;
	
	@PostMapping("/addLocation")
	public String addLocation(@RequestBody Pincode pincode) {
		pincodeRepo.save(pincode);
		return "Success";
	}
	@GetMapping("/getLocations")
	public List<Pincode> getLocations(){
		return pincodeRepo.findAll();
	}
	@GetMapping("/getLocationByPincode/{pincode}")
		public Pincode getLocationByPincode(@PathVariable("pincode") int pincode) {
			return pincodeRepo.findById(pincode).get();
		}
	
	

}
