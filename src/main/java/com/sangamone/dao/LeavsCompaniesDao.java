package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.LeavsCompanies;

public interface LeavsCompaniesDao {

	String addLeavsCompany(LeavsCompanies leavsCompanies);

	List<LeavsCompanies> viewLeavsCompanies();

}
