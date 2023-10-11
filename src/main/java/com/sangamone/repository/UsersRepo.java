package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sangamone.model.Users;

public interface UsersRepo extends JpaRepository<Users, Integer>{
	@Query(value="select * from users where family_id =:family_id",nativeQuery=true)
	List<Users> getMusicUserByFamilyId(@Param("family_id") int family_id);
	
	@Query(value="select * from users where passcode=:passcode and email=:email", nativeQuery=true)
	Users validatePasscode(@Param("passcode") String passcode, @Param("email") String email);
	


}
