package com.sangamone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Families")
public class Families {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int family_id;
	
	@Column(unique=true, nullable=false)
	private String family_name;
	@Column(nullable=false)
	private String music_hour;
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
	
	

}
