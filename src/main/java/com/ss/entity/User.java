package com.ss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userinfo")
public class User {
	
	@Id
	@Column(name = "iduserinfo", nullable = false)
	private int iduserinfo;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "fullname", nullable = false)
	private String fullname;
	
	@Column(name = "emailid", nullable = false)
	private String emailid;
	
	@Column(name = "mobileno", nullable = false)
	private String mobileno;
	
	@Column(name = "location", nullable = false)
	private String location;
	
	@Column(name = "tagline", nullable = false)
	private String tagline;
	
	@Column(name = "qualification", nullable = false)
	private String qualification;
	
	@Column(name = "dob", nullable = false)
	private String dob;
	
	@Column(name = "experience", nullable = false)
	private String experience;
	
	@Column(name = "research_paper_id", nullable = false)
	private String research_paper_id;

	public int getIduserinfo() {
		return iduserinfo;
	}

	public void setIduserinfo(int iduserinfo) {
		this.iduserinfo = iduserinfo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getResearch_paper_id() {
		return research_paper_id;
	}

	public void setResearch_paper_id(String research_paper_id) {
		this.research_paper_id = research_paper_id;
	}

	@Override
	public String toString() {
		return "User [iduserinfo=" + iduserinfo + ", username=" + username + ", password=" + password + ", fullname="
				+ fullname + ", emailid=" + emailid + ", mobileno=" + mobileno + ", location=" + location + ", tagline="
				+ tagline + ", qualification=" + qualification + ", dob=" + dob + ", experience=" + experience
				+ ", research_paper_id=" + research_paper_id + "]";
	}
	
}
