package com.sangamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.model.Users;
import com.sangamone.repository.UsersRepo;

@RestController
public class UserController {
	@Autowired
	UsersRepo usersRepo;
	
	@PostMapping("/addMusicUsers")
	public String addUsers(@RequestBody Users users) {
		usersRepo.save(users);
		return "User added successfully";
	}

}
