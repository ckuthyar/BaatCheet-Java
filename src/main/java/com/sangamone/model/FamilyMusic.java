package com.sangamone.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class FamilyMusic {
	private int family_id;
	private String family_name;
	private String music_hour;
	public int music_id;
	public String music_url;
	public Date created_on;
	public int getFamily_id() {
		return family_id;
	}
	public void setFamily_id(int family_id) {
		this.family_id = family_id;
	}
	public String getFamily_name() {
		return family_name;
	}
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	public String getMusic_hour() {
		return music_hour;
	}
	public void setMusic_hour(String music_hour) {
		this.music_hour = music_hour;
	}
	public int getMusic_id() {
		return music_id;
	}
	public void setMusic_id(int music_id) {
		this.music_id = music_id;
	}
	public String getMusic_url() {
		return music_url;
	}
	public void setMusic_url(String music_url) {
		this.music_url = music_url;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

}
