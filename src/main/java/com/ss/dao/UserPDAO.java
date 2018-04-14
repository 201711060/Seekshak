package com.ss.dao;

import java.util.List;

import com.ss.entity.User_Proffesional_Detail;

public interface UserPDAO {
	void saveUser(User_Proffesional_Detail user);
    
    List<User_Proffesional_Detail> findAllUsers();
     
    void deleteUserByid(int id);
     
    User_Proffesional_Detail findByid(String id);
    
    User_Proffesional_Detail findByUserId(int id);
     
    void updateUser(User_Proffesional_Detail user);

	List<User_Proffesional_Detail> findByCategory(String usercategory);

}
