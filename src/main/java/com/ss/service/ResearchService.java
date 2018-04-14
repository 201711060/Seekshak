package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ss.dao.ResearchDAO;
import com.ss.entity.Research;
import com.ss.entity.User_Proffesional_Detail;

@Service("researchService")
@Transactional
public class ResearchService {
	@Autowired
	private ResearchDAO researchdao;

	public void saveResearch(Research research) {
		researchdao.saveResearch(research);
	}

	public List<Research> findAllResearch() {
		if(researchdao!=null)
			return researchdao.findAllResearch();
		else
			return null;
	}

	public void deleteUserById(int id) {
		researchdao.deleteResearchByid(id);
	}

	public Research findByUserId(int id) {
		return researchdao.findByUserId(id);
	}

	public void updateResearch(Research research) {
		researchdao.updateResearch(research);
	}

}
