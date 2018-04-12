package com.ss.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.ss.entity.Institute;
import com.ss.entity.Jobs;
import com.ss.entity.User;

@Repository("institutedao")
public class InstituteDAOImpl extends AbstractDAO implements InstituteDAO {

	public void saveInstitute(Institute institute) {
		// TODO Auto-generated method stub
		persist(institute);
	}

	public List<Institute> findAllInstitutes() {
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
		List<Institute> institutelist = criteria.list();
		return institutelist;
	}

	public void deleteInstituteByid(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("delete from jobs where id = :id");
		query.setInteger(0, id);
		query.executeUpdate();
	}

	public Institute findByid(String id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Institute.class);
		criteria.add(Restrictions.eq("email", id));
		return (Institute) criteria.uniqueResult();
	}

	public List<Institute> findByCategory(String jobcategory) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Institute.class);
		criteria.add(Restrictions.eq("jobcategory", jobcategory));
		return criteria.list();
	}
	
	public void updateInstitute(Institute institute) {
		// TODO Auto-generated method stub
		getSession().update(institute);
	}

}
