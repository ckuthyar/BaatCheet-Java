package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LeavsUsersDao;
import com.sangamone.model.LeavsCompanies;
import com.sangamone.model.LeavsCompaniesUsers;
import com.sangamone.model.LeavsUsers;
import com.sangamone.repository.LeavsCompaniesRepo;
import com.sangamone.repository.LeavsUsersRepo;
@Service
public class LeavsUsersServiceImpl implements LeavsUsersDao {
	
	@Autowired
	LeavsUsersRepo leavsUsersRepo;
	
	@Autowired
	LeavsCompaniesRepo leavsCompaniesRepo;

	@Override
	public String addLeavsUser(LeavsCompaniesUsers leavsCompaniesUsers) {
		String result="Company not found";
		LeavsCompanies leavsCompanies=leavsCompaniesRepo.addLeavsUser(leavsCompaniesUsers.getCompany_name());
		if(leavsCompanies!=null) {
			LeavsUsers leavsUsers = new LeavsUsers();
			leavsUsers.setUser_name(leavsCompaniesUsers.getUser_name());
			leavsUsers.setUser_email(leavsCompaniesUsers.getUser_email());
			leavsUsers.setUser_gender(leavsCompaniesUsers.getUser_gender());
			leavsUsers.setUser_pwd(leavsCompaniesUsers.getUser_pwd());
			leavsUsers.setUser_role(leavsCompaniesUsers.getUser_role());
			leavsUsers.setCreated_on(leavsCompaniesUsers.getCreated_on());
			leavsUsers.setCreated_by(leavsCompaniesUsers.getCreated_by());
			leavsUsers.setCompany_id(leavsCompanies.getCompany_id());
			leavsUsersRepo.save(leavsUsers);
			result="User added successfully";
		}
		return result;
	}

	@Override
	public List<LeavsUsers> viewLeavsUsers() {
		return leavsUsersRepo.findAll();
	}

	@Override
	public List<LeavsUsers> viewLeavsUsersByCompanyId(int company_id) {
		return leavsUsersRepo.viewLeavsUsersByCompanyId(company_id);
	}

	@Override
	public LeavsUsers viewLeavsUsersByUserId(int user_id) {
		return leavsUsersRepo.findById(user_id).get();
	}

	@Override
	public List<LeavsUsers> viewLeavsUsersByUserRole(String user_role) {

		return leavsUsersRepo.viewLeavsUsersByUserRole(user_role);
	}

	@Override
	public List<LeavsUsers> viewLeavsUsersByCompanyIdRole(int company_id, String user_role) {
		
		return leavsUsersRepo.viewLeavsUsersByCompanyIdRole(company_id, user_role);
	}
	

} 
