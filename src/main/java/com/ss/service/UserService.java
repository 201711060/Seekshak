package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ss.dao.JobsDAO;
import com.ss.dao.UserDAO;
import com.ss.entity.User;
import com.ss.entity.Jobs;

@Service("userService")
@Transactional
public class UserService {
	@Autowired
	private UserDAO userdao;

	public void saveUser(User user) {
		userdao.saveUser(user);
	}

	public List<User> findAllUsers() {
		if(userdao!=null)
			return userdao.findAllUsers();
		else
			return null;
	}

	public void deleteUserById(int id) {
		userdao.deleteUserByid(id);
	}

	public User findById(String id) {
		return userdao.findByid(id);
	}

	public User findByUserId(int id) {
		return userdao.findByUserId(id);
	}

	public List<User> findByCategory(String jobcategory) {
		return userdao.findByCategory(jobcategory);
	}
	
	public void updateUser(User user) {
		userdao.updateUser(user);
	}

}
