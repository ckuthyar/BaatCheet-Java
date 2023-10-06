package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.model.Music;
import com.sangamone.model.Users;
import com.sangamone.repository.UsersRepo;

@RestController
public class UserController {
	@Autowired
	UsersRepo usersRepo;
	
	private String generatedPasscode() {
		return String.valueOf((int)(Math.random()*900000)+100000);
	}
	
	@PostMapping("/addMusicUserByFamilyId/{family_id}")
	public String addUsers(@RequestBody Users users, @PathVariable("family_id") int family_id, String user_name, String email) {
		String passcode=generatedPasscode();
		users.setPasscode(passcode);
	
		users.setFamily_id(family_id);
		usersRepo.save(users);
		return "User added successfully";
	}
	
	@GetMapping("/getMusicUsers")
	public List<Users> getMusicUser(){
		return usersRepo.findAll();
	}
	
	@GetMapping("/getMusicUserByFamilyId/{family_id}")
	public List<Users> getMusicUserByFamilyId(@PathVariable("family_id") int family_id){
		return usersRepo.getMusicUserByFamilyId(family_id);
		
	}

}
