package com.sangamone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loanuser")
public class LoanUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loanuser_id;
	//@Column(nullable=false)
	private String name;
	//@Column(nullable=false)
	private String phoneno;
	private String email;
	//@Column(nullable=false)
	private String aadhaar;
	private int center_id;
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
	public int getCenter_id() {
		return center_id;
	}
	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}
	

}
