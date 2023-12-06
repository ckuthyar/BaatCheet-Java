package com.sangamone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loanadmin")
public class LoanAdmin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int admin_id;
	//@Column(nullable=false)
	private String admin_name;
	//@Column(nullable=false)
	private String admin_phoneno;
	private String admin_email;
	//@Column(nullable=false)
	private String admin_aadhaar;
	private int center_id;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_phoneno() {
		return admin_phoneno;
	}
	public void setAdmin_phoneno(String admin_phoneno) {
		this.admin_phoneno = admin_phoneno;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getAdmin_aadhaar() {
		return admin_aadhaar;
	}
	public void setAdmin_aadhaar(String admin_aadhaar) {
		this.admin_aadhaar = admin_aadhaar;
	}
	public int getCenter_id() {
		return center_id;
	}
	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}
	
	

}
