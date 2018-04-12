package com.ss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "institute")
public class Institute {

	@Override
	public String toString() {
		return "Institute [idinstitute=" + idinstitute + ", institutename=" + institutename + ", institutecategory="
				+ institutecategory + ", institutewebsite=" + institutewebsite + ", affiliateduniversity="
				+ affiliateduniversity + ", ranking=" + ranking + ", institutetype=" + institutetype + ", active="
				+ active + ", city=" + city + ", state=" + state + ", address=" + address + ", contactno=" + contactno
				+ ", email=" + email + ", password=" + password + "]";
	}

	@Id
	@Column(name = "idinstitute", nullable = false)
	private int idinstitute;

	@Column(name = "institutename", nullable = false)
	private String institutename;

	@Column(name = "institutecategory", nullable = false)
	private String institutecategory;

	@Column(name = "institutewebsite", nullable = false)
	private String institutewebsite;

	@Column(name = "affiliateduniversity", nullable = false)
	private String affiliateduniversity;

	@Column(name = "ranking", nullable = false)
	private String ranking;

	@Column(name = "institutetype", nullable = false)
	private String institutetype;

	@Column(name = "active", nullable = false)
	private String active;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "state", nullable = false)
	private String state;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "contactno", nullable = false)
	private String contactno;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdinstitute() {
		return idinstitute;
	}

	public void setIdinstitute(int idinstitute) {
		this.idinstitute = idinstitute;
	}

	public String getInstitutename() {
		return institutename;
	}

	public void setInstitutename(String institutename) {
		this.institutename = institutename;
	}

	public String getInstitutecategory() {
		return institutecategory;
	}

	public void setInstitutecategory(String institutecategory) {
		this.institutecategory = institutecategory;
	}

	public String getInstitutewebsite() {
		return institutewebsite;
	}

	public void setInstitutewebsite(String institutewebsite) {
		this.institutewebsite = institutewebsite;
	}

	public String getAffiliateduniversity() {
		return affiliateduniversity;
	}

	public void setAffiliateduniversity(String affiliateduniversity) {
		this.affiliateduniversity = affiliateduniversity;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public String getInstitutetype() {
		return institutetype;
	}

	public void setInstitutetype(String institutetype) {
		this.institutetype = institutetype;
	}

}
