package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.model.Families;
import com.sangamone.model.FamilyUser;
import com.sangamone.model.Music;
import com.sangamone.model.Users;
import com.sangamone.repository.FamiliesRepo;
import com.sangamone.repository.UsersRepo;

@RestController
public class UserController {
	@Autowired
	UsersRepo usersRepo;
	
	@Autowired
	FamiliesRepo familiesRepo;
	
	private String generatedPasscode() {
		return String.valueOf((int)(Math.random()*900000)+100000);
	}
	
	@PostMapping("/addMusicUserByFamilyName")
	public String addUsers(@RequestBody FamilyUser familyUser) {
		String result="Family not found";
		Families fam= familiesRepo.addMusicUserByFamilyName(familyUser.getFamily_name());
		if(fam!=null) {
			Users users = new Users();
			users.setEmail(familyUser.getEmail());
			users.setUser_name(familyUser.getUser_name());
		    users.setIs_admin(familyUser.getIs_admin());
			users.setFamily_id(fam.getFamily_id());
			String passcode=generatedPasscode();
			users.setPasscode(passcode);
			usersRepo.save(users);
			result="User added successfully";
		}
		return result;
	}
	
	@GetMapping("/getMusicUsers")
	public List<Users> getMusicUser(){
		return usersRepo.findAll();
	}
	
	@GetMapping("/getMusicUserByFamilyId/{family_id}")
	public List<Users> getMusicUserByFamilyId(@PathVariable("family_id") int family_id){
		return usersRepo.getMusicUserByFamilyId(family_id);
		
	}
	@PostMapping("/validatePasscode")
	public Users validatePasscode(@RequestBody Users users) {
		return usersRepo.validatePasscode(users.getPasscode(), users.getEmail());
	}

}
