package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ss.dao.JobApplicationDAO;
import com.ss.entity.Job_Application;

@Service("jobsApplicationService")
@Transactional
public class JobsApplicationService {
	@Autowired
	JobApplicationDAO jobsApplicationdao;
	
	public void saveApplication(Job_Application jobApplication) {
		jobsApplicationdao.saveApplication(jobApplication);
	}


	public void deleteJobApplicationByid(int jobid, int candidate_id) {
		jobsApplicationdao.deleteJobApplicationByid(jobid, candidate_id);
	}

	public List<Job_Application> findByCandidateId(int candidate_id) {
		return jobsApplicationdao.findByCandidateId(candidate_id);
	}

	public void updateJobApplication(Job_Application jobApplication) {
		jobsApplicationdao.updateJobApplication(jobApplication);
	}

	public List<Job_Application> findByJobID(int jobid) {
		return jobsApplicationdao.findByJobID(jobid);
	}

}
