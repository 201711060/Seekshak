package com.ss.dao;

import java.util.List;

import com.ss.entity.Institute;

public interface InstituteDAO {
	void saveInstitute(Institute institute);
    
    List<Institute> findAllInstitutes();
     
    void deleteInstituteByid(int id);
     
    Institute findByid(String id);
    
    Institute findByInstituteid(int id);
     
    void updateInstitute(Institute institute);

	List<Institute> findInactiveInstitute();

}
