package com.centrain.hibernate.dao.twelfth.practice.impl;

import java.util.List;

import com.centrain.hibernate.dao.impl.BaseDAO;
import com.centrain.hibernate.dao.twelfth.practice.ScoreDAO;
import com.centrain.hibernate.model.twelfth.practice.Score;
import com.centrain.hibernate.model.twelfth.practice.Student;

public class ScoreDAOHibImpl extends BaseDAO implements ScoreDAO {
 
	String hibernateCfgName="hibernate.cfg7.xml";
	
	@SuppressWarnings("unchecked")
	public List<Score> getQuery() {
		
		List<Score> list=(List<Score>) super.getAll("Score", hibernateCfgName);
				
		return list;
	}


	/**
	 * 给学员添加成绩
	 */
	public boolean addScore(Score score) {
		
		return super.insertBoolean(score, hibernateCfgName);
	}

	public boolean deleteScore(Integer score__id) {
		
		return super.deleteBoolean(Score.class, score__id, hibernateCfgName);
	}

	public Student getStudentByScoreId(Integer score_id) {
		
		return null;
	}

	public boolean updateScore(Score score) {
		
		return false;
	}

//	public static void main(String[] args) {
//		ScoreDAOHibImpl s=new ScoreDAOHibImpl();
//		System.out.println(s.deleteScore(2));
//	}
	
}
