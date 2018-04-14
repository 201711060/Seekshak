package com.ss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_proffesional_detail")
public class User_Proffesional_Detail {

	@Id
	@Column(name = "iduser_proffesional_detail", nullable = false)
	private int iduser_proffesional_detail;

	@Column(name = "user_id", nullable = false)
	private int user_id;
	@Column(name = "postgrad_branch", nullable = false)
	private String postgrad_branch;
	@Column(name = "phd_subject", nullable = false)
	private String phd_subject;
	@Column(name = "pg_cpi", nullable = false)
	private String pg_cpi;
	@Column(name = "grad_branch", nullable = false)
	private String grad_branch;
	@Column(name = "grad_cpi", nullable = false)
	private String grad_cpi;
	@Column(name = "twelve", nullable = false)
	private String twelve;

	public int getIduser_proffesional_detail() {
		return iduser_proffesional_detail;
	}

	public void setIduser_proffesional_detail(int iduser_proffesional_detail) {
		this.iduser_proffesional_detail = iduser_proffesional_detail;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getPostgrad_branch() {
		return postgrad_branch;
	}

	public void setPostgrad_branch(String postgrad_branch) {
		this.postgrad_branch = postgrad_branch;
	}

	public String getPhd_subject() {
		return phd_subject;
	}

	public void setPhd_subject(String phd_subject) {
		this.phd_subject = phd_subject;
	}

	public String getPg_cpi() {
		return pg_cpi;
	}

	public void setPg_cpi(String pg_cpi) {
		this.pg_cpi = pg_cpi;
	}

	public String getGrad_branch() {
		return grad_branch;
	}

	public void setGrad_branch(String grad_branch) {
		this.grad_branch = grad_branch;
	}

	public String getGrad_cpi() {
		return grad_cpi;
	}

	public void setGrad_cpi(String grad_cpi) {
		this.grad_cpi = grad_cpi;
	}

	public String getTwelve() {
		return twelve;
	}

	public void setTwelve(String twelve) {
		this.twelve = twelve;
	}

	@Override
	public String toString() {
		return "User_Proffesional_Detail [iduser_proffesional_detail=" + iduser_proffesional_detail + ", user_id="
				+ user_id + ", postgrad_branch=" + postgrad_branch + ", phd_subject=" + phd_subject + ", pg_cpi="
				+ pg_cpi + ", grad_branch=" + grad_branch + ", grad_cpi=" + grad_cpi + ", twelve=" + twelve + "]";
	}

}
