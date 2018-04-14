package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ss.dao.InstituteDAO;
import com.ss.entity.Institute;

@Service("instituteService")
@Transactional
public class InstituteService {
	@Autowired
	private InstituteDAO instdao;

	public void saveInstitute(Institute institute) {
		instdao.saveInstitute(institute);
	}

	public List<Institute> findAllInstitutes() {
		if(instdao!=null)
			return instdao.findAllInstitutes();
		else
			return null;
	}

	public void deleteInstituteById(int id) {
		instdao.deleteInstituteByid(id);
	}

	public Institute findById(String id) {
		return instdao.findByid(id);
	}

	public Institute findByInstituteId(int id) {
		return instdao.findByInstituteid(id);
	}
	
	public List<Institute> findInactiveInstitute() {
		return instdao.findInactiveInstitute();
	}
	
	public void updateInstitute(Institute institute) {
		instdao.updateInstitute(institute);
	}

}
