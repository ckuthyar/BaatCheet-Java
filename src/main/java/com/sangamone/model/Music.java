package com.sangamone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name="music")
public class Music {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	public int music_id;
	@Column(nullable=false)
	public String music_url;
	public int family_id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	public Date created_on;
	
	@PrePersist
	private void onCreate() {
		created_on = new Date();
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
	public int getFamily_id() {
		return family_id;
	}
	public void setFamily_id(int family_id) {
		this.family_id = family_id;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	
	
	

}
