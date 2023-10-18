package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.LeavsCompaniesUsers;
import com.sangamone.model.LeavsUsers;

public interface LeavsUsersDao {

	String addLeavsUser(LeavsCompaniesUsers leavsCompaniesUsers);

	List<LeavsUsers> viewLeavsUsers();

	List<LeavsUsers> viewLeavsUsersByCompanyId(int company_id);

	LeavsUsers viewLeavsUsersByUserId(int user_id);

	List<LeavsUsers> viewLeavsUsersByUserRole(String user_role);

	List<LeavsUsers> viewLeavsUsersByCompanyIdRole(int company_id, String user_role);

}
