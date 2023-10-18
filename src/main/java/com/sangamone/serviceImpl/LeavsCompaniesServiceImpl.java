package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LeavsCompaniesDao;
import com.sangamone.model.LeavsCompanies;
import com.sangamone.repository.LeavsCompaniesRepo;
@Service
public class LeavsCompaniesServiceImpl implements LeavsCompaniesDao {
	@Autowired
	LeavsCompaniesRepo leavsCompaniesRepo;

	@Override
	public String addLeavsCompany(LeavsCompanies leavsCompanies) {
		leavsCompaniesRepo.save(leavsCompanies);
		return "Company added successfully";
	}

	@Override
	public List<LeavsCompanies> viewLeavsCompanies() {
		return leavsCompaniesRepo.findAll();
	}

}
