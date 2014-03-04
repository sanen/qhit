package com.centrain.hibernate.dao.impl;

import java.util.List;

import com.centrain.hibernate.dao.SelectDAO;


public class SelectDaoHibImpl extends BaseDAO implements SelectDAO {

	public List<Object> getall(int age,String sex) {
		
		super.getAll("selectActionForm");
		
		return null;
	}

}
