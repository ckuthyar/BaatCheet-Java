package com.sangamone.model;

import javax.persistence.Column;

public class EnrolmentCenterUser {
	private int center_id;
	private String center_name;
	private String center_location;
	private int status;
	private int loanuser_id;
	private String name;
	private String phoneno;
	private String email;
	private String aadhaar;
	public int getCenter_id() {
		return center_id;
	}
	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}
	public String getCenter_name() {
		return center_name;
	}
	public void setCenter_name(String center_name) {
		this.center_name = center_name;
	}
	public String getCenter_location() {
		return center_location;
	}
	public void setCenter_location(String center_location) {
		this.center_location = center_location;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getLoanuser_id() {
		return loanuser_id;
	}
	public void setLoanuser_id(int loanuser_id) {
		this.loanuser_id = loanuser_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	


}
