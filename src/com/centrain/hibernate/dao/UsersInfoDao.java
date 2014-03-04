package com.centrain.hibernate.dao;

import java.util.List;

import com.centrain.hibernate.model.Usersinfo;
//usersinfo  相关查询
public interface UsersInfoDao {

	public List<Usersinfo> manyQuery();
	
	public List<Object[]> manyQuery2();
	
	public List<String> manyQuery3();
	
	
}
