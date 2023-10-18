package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.model.Families;
import com.sangamone.repository.FamiliesRepo;

@RestController
public class FamiliesController {
	@Autowired
	FamiliesRepo familiesRepo;
	
	@PostMapping("/addMusicFamily")
	public Families addFamily(@RequestBody Families families) {
		return familiesRepo.save(families);
		
		
	}
	
	@GetMapping("/getMusicFamilies")
	public List<Families> getMusicContent(){
		return familiesRepo.findAll();
	}
	@GetMapping("/getMusicFamilyByFamilyId/{family_id}")
	public Families getMusicFamilyByFamilyId(@PathVariable("family_id") int family_id){
		return familiesRepo.findById(family_id).get();
		
	}
	

}
