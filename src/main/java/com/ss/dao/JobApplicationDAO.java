package com.ss.dao;

import java.util.List;

import com.ss.entity.Institute;
import com.ss.entity.Job_Application;

public interface JobApplicationDAO {
	
	void saveApplication(Job_Application jobApplication);
    
    void deleteJobApplicationByid(int jobid, int candidate_id);
     
    List<Job_Application> findByCandidateId(int candidate_id);
     
    void updateJobApplication(Job_Application jobApplication);

	List<Job_Application> findByJobID(int jobid);
}
