package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.model.Families;
import com.sangamone.model.FamilyMusic;
import com.sangamone.model.Music;
import com.sangamone.model.Users;
import com.sangamone.repository.FamiliesRepo;
import com.sangamone.repository.MusicRepo;

@RestController
public class MusicController {
	@Autowired
	MusicRepo musicRepo;
	
	@Autowired
	FamiliesRepo familiesRepo;
	
	@PostMapping("/addMusicContentByFamilyName")
	public String addMusicContent(@RequestBody FamilyMusic familyMusic) {
		String result="Family not found";
		Families fam=familiesRepo.addMusicUserByFamilyName(familyMusic.getFamily_name());
		if (fam!=null) {
			Music music = new Music();
			music.setMusic_url(familyMusic.getMusic_url());
			music.setFamily_id(fam.getFamily_id());
			musicRepo.save(music);
		result="Music Content added successfully";
		}
		return result;
	}
	
	@GetMapping("/getMusicContents")
	public List<Music> getMusicContent(){
		return musicRepo.findAll();
	}
	
	@GetMapping("/getMusicContentByFamilyId/{family_id}")
	public List<Music>getMusicContentByFamilyId(@PathVariable int family_id){
		return musicRepo.getMusicContentByFamilyId(family_id);
		
	}

}
