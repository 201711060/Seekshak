package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ss.dao.UserPDAO;
import com.ss.entity.User;
import com.ss.entity.User_Proffesional_Detail;

@Service("userPService")
@Transactional
public class UserPService {
	@Autowired
	private UserPDAO userpdao;

	public void saveUser(User_Proffesional_Detail user) {
		userpdao.saveUser(user);
	}

	public List<User_Proffesional_Detail> findAllUsers() {
		if(userpdao!=null)
			return userpdao.findAllUsers();
		else
			return null;
	}

	public void deleteUserById(int id) {
		userpdao.deleteUserByid(id);
	}

	public User_Proffesional_Detail findById(String id) {
		return userpdao.findByid(id);
	}

	public User_Proffesional_Detail findByUserId(int id) {
		return userpdao.findByUserId(id);
	}

	public List<User_Proffesional_Detail> findByCategory(String jobcategory) {
		return userpdao.findByCategory(jobcategory);
	}
	
	public void updateUser(User_Proffesional_Detail user) {
		userpdao.updateUser(user);
	}

}
