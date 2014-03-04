package com.centrain.hibernate.model.twelfth.practice;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author zhangkehua
 *  学生实体
 */

@SuppressWarnings("serial")//镇压警告的 序列(serial)

public class Student implements Serializable {

	private Integer sid;
	private String sname;
	private Integer sage;
	
	private Set<Score> score=new HashSet<Score>();


	public Set<Score> getScore() {
		return score;
	}


	public void setScore(Set<Score> score) {
		this.score = score;
	}


	@SuppressWarnings("unchecked")
	public Student(String sname, Integer sage) {
		this.sname = sname;
		this.sage = sage;
		
	}


	public Student(){}


	public Integer getSid() {
		return sid;
	}


	public void setSid(Integer sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Integer getSage() {
		return sage;
	}


	public void setSage(Integer sage) {
		this.sage = sage;
	}

	
	
	
}
