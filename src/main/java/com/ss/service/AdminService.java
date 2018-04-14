package com.ss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ss.dao.AdminDAO;
import com.ss.entity.Admin;

@Service("adminService")
@Transactional
public class AdminService {

	@Autowired
	public AdminDAO admindao;
	
	public Admin findAdmin(String username) {
		return admindao.findAdmin(username);
	}
	
}
