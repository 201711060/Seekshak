package com.ss.dao;

import java.util.List;

import com.ss.entity.Research;

public interface ResearchDAO {
	
	void saveResearch(Research research);
    
    List<Research> findAllResearch();
     
    void deleteResearchByid(int id);
     
    Research findByUserId(int id);
     
    void updateResearch(Research research);

}
