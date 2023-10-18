package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sangamone.model.LeavsUsers;

public interface LeavsUsersRepo extends JpaRepository<LeavsUsers, Integer>{
	@Query(value="select * from leavs_users where company_id=:company_id",nativeQuery=true)
	List<LeavsUsers> viewLeavsUsersByCompanyId(int company_id);
	
	@Query(value="select * from leavs_users where user_role=:user_role", nativeQuery=true)
	List<LeavsUsers> viewLeavsUsersByUserRole(String user_role);

	@Query(value="select * from leavs_users where company_id=:company_id and user_role=:user_role", nativeQuery=true)
	List<LeavsUsers> viewLeavsUsersByCompanyIdRole(@Param("company_id") int company_id, @Param("user_role") String user_role);
	

}
