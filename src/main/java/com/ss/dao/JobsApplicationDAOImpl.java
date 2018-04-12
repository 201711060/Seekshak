package com.ss.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.ss.entity.Job_Application;
import com.ss.entity.Jobs;

@Repository("jobsApplicationdao")
public class JobsApplicationDAOImpl extends AbstractDAO implements JobApplicationDAO {

	public void saveApplication(Job_Application jobApplication) {
		persist(jobApplication);
	}


	public void deleteJobApplicationByid(int jobid, int candidate_id) {
		Query query = getSession().createSQLQuery("delete from job_application where candidate_id = :cid and job_id = :jid");
		query.setInteger(0, candidate_id);
		query.setInteger(1, jobid);
		query.executeUpdate();
	}

	public List<Job_Application> findByCandidateId(int candidate_id) {
		Criteria criteria = getSession().createCriteria(Job_Application.class);
		criteria.add(Restrictions.eq("candidate_id", candidate_id));
		return criteria.list();
	}

	public void updateJobApplication(Job_Application jobApplication) {
		getSession().update(jobApplication);
		
	}

	public List<Job_Application> findByJobID(int jobid) {
		Criteria criteria = getSession().createCriteria(Job_Application.class);
		criteria.add(Restrictions.eq("job_id", jobid));
		return criteria.list();
	}

}
