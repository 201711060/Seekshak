package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ss.dao.JobsDAO;
import com.ss.entity.Jobs;

@Service("jobsService")
@Transactional
public class JobsService {
	@Autowired
	private JobsDAO dao;

	public void saveJob(Jobs job) {
		dao.saveJob(job);
	}

	public List<Jobs> findAllJobs() {
		if(dao!=null)
			return dao.findAllJobs();
		else
			return null;
	}

	public void deleteJobById(int id) {
		dao.deletejobByid(id);
	}

	public Jobs findById(int id) {
		return dao.findByid(id);
	}

	public List<Jobs> findByCategory(String jobcategory) {
		return dao.findByCategory(jobcategory);
	}
	
	public List<Jobs> findByPostedByID(int postedByid) {
		return dao.findByPostedByID(postedByid);
	}

	public void updateEmployee(Jobs job) {
		dao.updateEmployee(job);
	}
}
