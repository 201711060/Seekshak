package com.ss.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.ss.entity.Research;
import com.ss.entity.User;

@Repository("researchdao")
public class ResearchDAOImpl extends AbstractDAO implements ResearchDAO {

	public void saveResearch(Research research) {
		persist(research);
	}

	public List<Research> findAllResearch() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Research.class);
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
		List<Research> researchlist = criteria.list();
		return researchlist;
	}

	public void deleteResearchByid(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("delete from jobs where id = :id");
		query.setInteger(0, id);
		query.executeUpdate();
	}

	public void updateResearch(Research user) {
		// TODO Auto-generated method stub
		getSession().update(user);
	}

	public Research findByUserId(int id) {
		Criteria criteria = getSession().createCriteria(Research.class);
		criteria.add(Restrictions.eq("user_id", id));
		return (Research) criteria.uniqueResult();
	}

}
