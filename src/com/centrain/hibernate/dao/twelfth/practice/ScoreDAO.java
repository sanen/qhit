package com.centrain.hibernate.dao.twelfth.practice;

import java.util.List;

import com.centrain.hibernate.model.twelfth.practice.Score;
import com.centrain.hibernate.model.twelfth.practice.Student;


public interface ScoreDAO {

	/**
	 * 添加学员
	 * @param student
	 */
	public boolean addScore(Score score);
	
	/**
	 * 获得要修改的学员信息 包括姓名 年龄 以及相应的成绩
	 * student_id=score_id 是统一的
	 * @param sid
	 * @return
	 */
	public Student getStudentByScoreId(Integer score_id);
	
	/**
	 * 修改学员信息  包括姓名 年龄 以及相应的成绩
	 */
	public boolean updateScore(Score score);
		
	
	/**
	 * 删除学员
	 * @param id
	 * @return
	 */
	public boolean deleteScore(Integer score__id);
		
	/**
	 * 查询出所有学员信息
	 * @return
	 */
	public List<Score> getQuery();
}
