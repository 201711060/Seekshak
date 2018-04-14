package com.ss.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.ss.entity.Jobs;
import com.ss.entity.User;
import com.ss.entity.User_Proffesional_Detail;

@Repository("userpdao")
public class UserPDAOImpl extends AbstractDAO implements UserPDAO {

	public void saveUser(User_Proffesional_Detail user) {
		persist(user);
	}

	public List<User_Proffesional_Detail> findAllUsers() {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(User_Proffesional_Detail.class);
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
		List<User_Proffesional_Detail> userlist = criteria.list();
		return userlist;
	}

	public void deleteUserByid(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createSQLQuery("delete from jobs where id = :id");
		query.setInteger(0, id);
		query.executeUpdate();
	}

	public User_Proffesional_Detail findByid(String id) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(User_Proffesional_Detail.class);
		criteria.add(Restrictions.eq("emailid", id));
		return (User_Proffesional_Detail) criteria.uniqueResult();
	}

	public List<User_Proffesional_Detail> findByCategory(String jobcategory) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(User_Proffesional_Detail.class);
		criteria.add(Restrictions.eq("jobcategory", jobcategory));
		return criteria.list();
	}
	
	public void updateUser(User_Proffesional_Detail user) {
		// TODO Auto-generated method stub
		getSession().update(user);
	}

	public User_Proffesional_Detail findByUserId(int id) {
		Criteria criteria = getSession().createCriteria(User_Proffesional_Detail.class);
		criteria.add(Restrictions.eq("user_id", id));
		return (User_Proffesional_Detail) criteria.uniqueResult();
	}

}
