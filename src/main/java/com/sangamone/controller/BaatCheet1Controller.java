package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.model.Content;
import com.sangamone.repository.BaatCheet1Repo;

@RestController

public class BaatCheet1Controller {
	@Autowired
	BaatCheet1Repo baatCheet1Repo;
	
	@PostMapping("/addContent")
	public String addContent(@RequestBody Content content) {
		baatCheet1Repo.save(content);
		return "Inserted";
		
	}
	
	@GetMapping("/viewContent")
	public List<Content> viewContent(){
		return baatCheet1Repo.findAll();
	}
	
	@GetMapping("/sample")
	public String sample() {
		return "Hello World";
	}

}
