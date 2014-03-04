package com.centrain.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.centrain.hibernate.HibernateSessionFactory;
import com.centrain.hibernate.dao.UsersInfoDao;
import com.centrain.hibernate.model.Usersinfo;

public class UsersinfoHibImpl extends BaseDAO implements UsersInfoDao {

	public void selectHql(){
		
		//1查询出所有用户信息
		@SuppressWarnings("unused")
		String hql="from Usersinfo";
		//Query query=session.createQuery(hql);
		
		//2通过具体包名访问表中信息
		@SuppressWarnings("unused")
		String hql2="from com.centrain.hibernate.model.Usersinfo";
		//Query query=session.createQuery(hql2);
		
		//3 where select
		@SuppressWarnings("unused")
		String hql3="from Usersinfo where id<8";
		//Query query=session.createQuery(hql3);
		
		//4 order by 
		@SuppressWarnings("unused")
		String hql4="From Usersinfo order by id desc";
		//Query query=session.createQuery(hql4);
	}
	
	/**
	 *  查询
	 * 
	 * 1 查询所有 
	 * 
	 * 2 通过具体包名查询所有
	 * 	
	 * 3 where 条件查询 
	 * 
	 * 4 order by 排序
	 *  
	 * 5 使用聚合函数查询 
	 *
	 */
	@SuppressWarnings("unchecked")
	public List<Usersinfo> manyQuery() {
		
		Session session=HibernateSessionFactory.getSession();
		
	
		String hql5="From Usersinfo where id<? and username like ?";
		
		Query query=session.createQuery(hql5);
		query.setParameter(0, 5);
		query.setParameter(1, "%l%");
		
		List<Usersinfo> list=query.list();
		
		for (Usersinfo usersinfo:list) {
			System.out.println(usersinfo.getId()+":"+usersinfo.getUsername());
		}
		
		session.close();
		
		return list;
	}

	/**
	 * 获取相关查询的结果
	 * 
	 * 5 查询多个属性 并使用顺序占位符  ？？？ 0，1，2
	 * 
	 * 6 使用聚合函数查询 
	 * 
	 * 7 group by 分组并使用 having进行筛选  注意：group by 使用于带聚合函数的查询语句中
	 */
	@SuppressWarnings("unchecked")
	public List<Object[]> manyQuery2() {
		
		Session session=HibernateSessionFactory.getSession();
		
		//5 查询多个属性 并设置顺序占位符
		String hql5="select id,username,age from Usersinfo where id<? ";
		Query query=session.createQuery(hql5);
		query.setInteger(0, 8);
		//6 使用聚合函数查询
		@SuppressWarnings("unused")	
		String hql6="select max(users.age),count(*),min(users.username) From Usersinfo users ";
		//Query query=session.createQuery(hql6);
		
		//group by 分组并使用 having进行筛选 
		@SuppressWarnings("unused")
		String hql7="select count(*),age from Usersinfo group by age having count(age)>1";
		//Query query=session.createQuery(hql7);
		
		
		List<Object[]> list=query.list();
		for(Object[] obj:list){
			System.out.println(obj[0]+":"+obj[1]);
		}
		session.close();
		
		return null;
	}

	public List<String> manyQuery3() {
		
		
		return null;
	}
	
	public static void main(String[] args) {
		new UsersinfoHibImpl().manyQuery();
//		new UsersinfoHibImpl().manyQuery2();
	}
	
	
	

}
