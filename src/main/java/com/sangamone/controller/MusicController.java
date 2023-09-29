package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.model.Music;
import com.sangamone.repository.MusicRepo;

@RestController
public class MusicController {
	@Autowired
	MusicRepo musicRepo;
	
	@PostMapping("/addMusicContent")
	public String addMusicContent(@RequestBody Music music) {
		musicRepo.save(music);
		return "Music Content added successfully";
	}
	
	@GetMapping("/getMusicContent")
	public List<Music> getMusicContent(){
		return musicRepo.findAll();
	}
	@GetMapping("/getMusicContentByFamilyId/{family_id}")
	public List<Music>getMusicContentByFamilyId(@PathVariable int family_id){
		return musicRepo.getMusicContentByFamilyId(family_id);
		
	}

}
