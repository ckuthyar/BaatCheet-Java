package com.sangamone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enrolment_center")
public class EnrolmentCenter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int center_id;
	private String center_name;
	private String center_location;
	private int status;
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


}
