package com.ss.dao;

import java.util.List;

import com.ss.entity.Jobs;

public interface JobsDAO {
	void saveJob(Jobs job);
    
    List<Jobs> findAllJobs();
     
    void deletejobByid(int id);
     
    Jobs findByid(int id);
     
    void updateJob(Jobs job);

	List<Jobs> findByCategory(String jobcategory);

	List<Jobs> findByPostedByID(int id);
	
	List<Jobs> findInactiveJobs();
}
