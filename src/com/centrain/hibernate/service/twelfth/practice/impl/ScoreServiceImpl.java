package com.centrain.hibernate.service.twelfth.practice.impl;

import java.util.List;

import com.centrain.hibernate.dao.twelfth.practice.ScoreDAO;
import com.centrain.hibernate.dao.twelfth.practice.impl.ScoreDAOHibImpl;
import com.centrain.hibernate.model.twelfth.practice.Score;
import com.centrain.hibernate.model.twelfth.practice.Student;
import com.centrain.hibernate.service.twelfth.practice.ScoreService;

public class ScoreServiceImpl implements ScoreService {

	ScoreDAO scoreDAO=new ScoreDAOHibImpl();
	
	
	public boolean addScore(Score score) {
		return false;
	}

	public boolean deleteScore(Integer score__id) {
		
		return scoreDAO.deleteScore(score__id);
	}

	public List<Score> getQuery() {
		
		return scoreDAO.getQuery();
	}

	public Student getStudentByScoreId(Integer score_id) {
		
		return null;
	}

	public boolean updateScore(Score score) {
		
		return false;
	}
	
	
}
