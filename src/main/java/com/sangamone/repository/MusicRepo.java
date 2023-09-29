package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sangamone.model.Music;

public interface MusicRepo extends JpaRepository<Music, Integer>{
	
	@Query(value="select * from music where family_id=:family_id",nativeQuery=true)
	List<Music> getMusicContentByFamilyId(@Param("family_id") int family_id);
}
