package com.ss.dao;

import java.util.List;

import com.ss.entity.User;
import com.ss.entity.Jobs;

public interface UserDAO {
	void saveUser(User user);
    
    List<User> findAllUsers();
     
    void deleteUserByid(int id);
     
    User findByid(String id);
    
    User findByUserId(int id);
     
    void updateUser(User user);

	List<User> findByCategory(String usercategory);

}
