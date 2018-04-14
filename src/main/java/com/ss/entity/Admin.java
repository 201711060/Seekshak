package com.ss.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	
	@Id
	@Column(name = "idadmin", nullable = false)
	private int idadmin;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String password;

	public int getIdadmin() {
		return idadmin;
	}

	public void setIdadmin(int idadmin) {
		this.idadmin = idadmin;
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

	@Override
	public String toString() {
		return "Admin [idadmin=" + idadmin + ", username=" + username + ", password=" + password + "]";
	}
	
}
