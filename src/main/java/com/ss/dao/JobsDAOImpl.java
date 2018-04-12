package com.ss.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.ss.entity.Jobs;

@Repository("dao")
public class JobsDAOImpl extends AbstractDAO implements JobsDAO {

	public void saveJob(Jobs job) {
		// TODO Auto-generated method stub
		persist(job);
	}

	public List<Jobs> findAllJobs() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Jobs.class);
//		String a_query = "select * from jobs join institute on jobs.postedby=institute.idinstitute;";
//		String b_query = "select * from institute";
//		String c_query = "select * from jobs";
//		Query query = getSession().createSQLQuery(c_query);
//		List<jobs> joblist = (List<jobs>) query.list();
//		if (joblist != null)
//			for (int i = 0; i < joblist.size(); i++) {
//				jobs myview = (jobs) joblist.get(i);
//				System.out.println(myview.getJobdescription());
//			}
//		
//		Query query1 = getSession().createSQLQuery(b_query);
//		List<institute> institutelist =  query.list();
//		if (institutelist != null)
//			for (int i = 0; i < institutelist.size(); i++) {
//				institute myview = (institute) institutelist.get(i);
//				System.out.println(myview.getInstitutename());
//			}
//		
		List<Jobs> joblist = criteria.list();
		return joblist;
	}

	public void deletejobByid(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("delete from jobs where id = :id");
		query.setInteger(0, id);
		query.executeUpdate();
	}

	public Jobs findByid(int id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Jobs.class);
		criteria.add(Restrictions.eq("id", id));
		return (Jobs) criteria.uniqueResult();
	}

	public List<Jobs> findByCategory(String jobcategory) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Jobs.class);
		criteria.add(Restrictions.eq("jobcategory", jobcategory));
		return criteria.list();
	}
	
	public void updateEmployee(Jobs job) {
		// TODO Auto-generated method stub
		getSession().update(job);
	}

}
