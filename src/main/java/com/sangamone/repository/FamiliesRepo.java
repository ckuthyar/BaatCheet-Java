package com.sangamone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sangamone.model.Families;

public interface FamiliesRepo extends JpaRepository<Families, Integer>{
	@Query(value="select * from families where family_name =:family_name", nativeQuery=true)
	public Families addMusicUserByFamilyName(@Param("family_name") String family_name);

}
