package com.ss.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ss.entity.Admin;

@Repository("admindao")
public class AdminDAOImpl extends AbstractDAO implements AdminDAO {

	public Admin findAdmin(String username) {
		Criteria criteria = getSession().createCriteria(Admin.class);
		criteria.add(Restrictions.eq("username", username));
		return (Admin) criteria.uniqueResult();
	}

}
