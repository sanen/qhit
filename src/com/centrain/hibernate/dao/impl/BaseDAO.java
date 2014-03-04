package com.centrain.hibernate.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.HibernateSessionFactory;

//abstract
public  class BaseDAO {


	/**
	 * 操作数据的步骤：
	 * 				1 session  
	 * 				2 Transaction 
	 * 				3 session.method() 
	 * 						  save(Object obj)、
	 * 						  delete(Object obj)、
	 * 						  update(Object obj)、
	 * 						  get(Class clazz,Ojbect obj) 
	 * 				4 Transaction.close()  
	 * 				5 session.close()
	 * 
	 */

	/**
	 * 添加
	 * session.save()
	 * @param obj
	 */
	public int insert(Object obj,String hibernateCfgName){
		/**
		 * Session 对象是 Hibernate持久化操作的基础（数据操作）
		 * 获取HibernateSessionFactory 中的Session对象 此对象用于
		 */

		Session session=new Configuration().configure(hibernateCfgName).buildSessionFactory().openSession();
			
		Transaction transaction=null;
		int i=0;
		try {
			transaction=session.beginTransaction();
			//System.out.println(transaction);

			session.save(obj);

			//System.out.println(obj);

			transaction.commit();
			i=1;
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}

		return i;

	}
	
	/**
	 *  添加
	 * @param obj
	 * @param hibernateCfgName
	 * @return
	 */
	public boolean insertBoolean(Object obj,String hibernateCfgName){
		/**
		 * Session 对象是 Hibernate持久化操作的基础（数据操作）
		 * 获取HibernateSessionFactory 中的Session对象 此对象用于
		 */

		Session session=new Configuration().configure(hibernateCfgName).buildSessionFactory().openSession();
			
		Transaction transaction=null;
		
		try {
			transaction=session.beginTransaction();
			//System.out.println(transaction);

			session.save(obj);

			//System.out.println(obj);

			transaction.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}

		return false;

	}
	
	/**
	 *  添加
	 * @param obj
	 * @param hibernateCfgName
	 * @return
	 */
	public boolean insertBoolean(Object obj){
		/**
		 * Session 对象是 Hibernate持久化操作的基础（数据操作）
		 * 获取HibernateSessionFactory 中的Session对象 此对象用于
		 */

		Session session=new Configuration().configure().buildSessionFactory().openSession();
			
		Transaction transaction=null;
		
		try {
			transaction=session.beginTransaction();
			//System.out.println(transaction);

			session.save(obj);

			//System.out.println(obj);

			transaction.commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}

		return false;

	}
	
	/**
	 * 添加
	 * session.save()
	 * @param obj
	 */
	public int insert(Object obj){
		/**
		 * Session 对象是 Hibernate持久化操作的基础（数据操作）
		 * 获取HibernateSessionFactory 中的Session对象 此对象用于
		 */

		Session session=HibernateSessionFactory.getSession();
		
		Transaction transaction=null;
		int i=0;
		try {
			transaction=session.beginTransaction();
			//System.out.println(transaction);

			session.save(obj);

			System.out.println(obj);

			transaction.commit();
			i=1;
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}

		return i;

	}
	

	/**
	 * 单项先要获取要删除的对象信息
	 * 
	 * session.delete()
	 * @param clazz
	 * @param id
	 */

	@SuppressWarnings("unchecked")
	public int delete(Class clazz,int id){
			
		Session session=HibernateSessionFactory.getSession();

		int result=0;
		Transaction transaction=null;
		//获取要删除的对象信息
		Object obj=session.get(clazz, id);
		try {
			transaction=session.beginTransaction();
			//进行删除操作
			session.delete(obj);
			transaction.commit();
			result=1;
		} catch (HibernateException e) {
			if(transaction!=null){
				transaction.rollback();
			}
			throw e;
		}finally{
			session.close();
		}

		return result;


	}

	/**
	 * 单项先要获取要删除的对象信息
	 * 
	 * session.delete()
	 * @param clazz
	 * @param id
	 */

	@SuppressWarnings("unchecked") 
	public boolean deleteBoolean(Class clazz,int id){
			
		Session session=HibernateSessionFactory.getSession();

		
		Transaction transaction=null;
		//获取要删除的对象信息
		Object obj=session.get(clazz, id);
		try {
			transaction=session.beginTransaction();
			//进行删除操作
			session.delete(obj);
			transaction.commit();
			return true;
		} catch (HibernateException e) {
			if(transaction!=null){
				transaction.rollback();
			}
			e.printStackTrace();
			
		}finally{
			session.close();
		}
		
		return false;

	}

	/**
	 * 单项先要获取要删除的对象信息
	 * 
	 * session.delete()
	 * @param clazz
	 * @param id
	 */

	@SuppressWarnings("unchecked")
	public boolean deleteBoolean(Class clazz,int id,String hibernateCfgName){
			
		Session session=new Configuration().configure(hibernateCfgName).buildSessionFactory().openSession();
		
		Transaction transaction=null;
		//获取要删除的对象信息
		Object obj=session.get(clazz,id);
		try {
			transaction=session.beginTransaction();
			//进行删除操作
			session.delete(obj);
			transaction.commit();
			return true;
		} catch (HibernateException e) {
			if(transaction!=null){
				transaction.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}

		return false;
	}
	/**
	 * 单项先要获取要删除的对象信息
	 * 
	 * session.delete()
	 * @param clazz
	 * @param id
	 */

	@SuppressWarnings("unchecked")
	public boolean deleteBoolean(Class clazz,long id,String hibernateCfgName){
			
		Session session=new Configuration().configure(hibernateCfgName).buildSessionFactory().openSession();
		
		
		Transaction transaction=null;
		//获取要删除的对象信息
		Object obj=session.get(clazz,(long)id);
		try {
			transaction=session.beginTransaction();
			//进行删除操作
			session.delete(obj);
			transaction.commit();
			return true;
		} catch (HibernateException e) {
			if(transaction!=null){
				transaction.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}

		return false;
	}
	
	
	

	/**
	 * 批量删除数据
	 * @param clazz
	 * @param obj
	 */
	@SuppressWarnings("unchecked")
	public void delete(Class clazz,Object...obj){
		
		Session session=HibernateSessionFactory.getSession();
		
		for (int i = 0; i < obj.length; i++) {

			try {
				session.delete(session.get(clazz, (Serializable) obj[i]));
				
				session.beginTransaction().commit();

				//事务提交后判断并进行session一级缓存的清空和提交

				if(i%10==0){
					session.clear();
					session.flush();
				}
				
			} catch (HibernateException e) {
				e.printStackTrace();
			}finally{
				session.close();
			}

		}

	}
	
	/**
	 * 批量删除数据
	 * @param clazz
	 * @param obj
	 */
	@SuppressWarnings("unchecked")
	public void delete(Class clazz,String hibernateCfgName,Object...obj){
		
		Session session=new Configuration().configure(hibernateCfgName).buildSessionFactory().openSession();
			
		for (int i = 0; i < obj.length; i++) {

			try {
				session.delete(session.get(clazz, (Serializable) obj[i]));
				session.beginTransaction().commit();

				//事务提交后判断并进行session一级缓存的清空和提交

				if(i%10==0){
					session.clear();
					session.flush();
				}
				
			} catch (HibernateException e) {
				e.printStackTrace();
			}finally{
				session.close();
			}

		}

	}


	/**
	 * 更新
	 * session.update()
	 * @param obj
	 */
	public int update(Object obj){

		int result=0;
		Session session=HibernateSessionFactory.getSession();

		Transaction transaction=null;

		try {
			transaction=session.beginTransaction();
			session.update(obj);
			transaction.commit();
			result=1;
			//System.out.println("resultBase="+result);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;

	}
	
	/**
	 * 更新
	 * session.update()
	 * @param obj
	 */
	public int update(Object obj,String hibernateCfgName){

		int result=0;
		Session session=new Configuration().configure(hibernateCfgName).buildSessionFactory().openSession();
		
		Transaction transaction=null;

		try {
			transaction=session.beginTransaction();
			session.update(obj);
			transaction.commit();
			result=1;
			//System.out.println("resultBase="+result);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;

	}
	/**
	 * 更新
	 * session.update()
	 * @param obj
	 */
	public boolean updateBoolean(Object obj,String hibernateCfgName){

		
		Session session=new Configuration().configure(hibernateCfgName).buildSessionFactory().openSession();
		
		Transaction transaction=null;
		
		session.setFlushMode(FlushMode.AUTO);
		session.flush();
		session.clear();
		
		try {
			transaction=session.beginTransaction();
			session.update(obj);
			transaction.commit();
			return true;
			//System.out.println("resultBase="+result);
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return false;

	}

	/**
	 * 查询 单条数据
	 * session.get()
	 * @param clazz
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Object get(Class clazz,int id){

		Session session=HibernateSessionFactory.getSession();
		Object obj=session.get(clazz, id);
		session.close();
		return obj;

	}
	
	/**
	 * 查询 单条数据
	 * session.get()
	 * @param clazz
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Object get(Class clazz,int id,String hibernateCfgName){
		
		Session session=new Configuration().configure(hibernateCfgName).buildSessionFactory().openSession();
		
		Object obj=session.get(clazz, id);
		session.close();
		return obj;

	}

	/**
	 *  查询所有数据
	 * @param obj
	 * @return
	 */
	public  List<?> getAll(Object obj){
		Session session=HibernateSessionFactory.getSession();

		Query query=session.createQuery("from "+obj+"");
		List<?> list=query.list();	
		session.close();
		return list;
	}
	/**
	 *  查询所有数据
	 * @param obj
	 * @return
	 */
	public  List<?> getAll(String obj,String hibernateCfgName){
		
		Session session=new Configuration().configure(hibernateCfgName).buildSessionFactory().openSession();
		
		Query query=session.createQuery("from "+obj+"");
		List<?> list=query.list();	
		session.close();
		return list;
	}

	/**
	 * 分页显示信息
	 * @param obj
	 * @param pageid
	 * @param pagesize
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<?> getAllByFenYe(Object obj,int pageid,int pagesize){

		Session session=HibernateSessionFactory.getSession();

		Query query=session.createQuery("from "+obj+"");
		if(pageid<=0){
			pageid=1;
		}
		query.setFirstResult((pageid-1)*pagesize);
		query.setMaxResults(pagesize);
		List<?> list=query.list();

		session.close();

		return list;
	}
	
	/**
	 * 分页显示信息
	 * @param obj
	 * @param pageid
	 * @param pagesize
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<?> getAllByFenYe(Object obj,int pageid,int pagesize,String hibernateCfgName){

		Session session=new Configuration().configure(hibernateCfgName).buildSessionFactory().openSession();
		
		Query query=session.createQuery("from "+obj+"");
		if(pageid<=0){
			pageid=1;
		}
		query.setFirstResult((pageid-1)*pagesize);
		query.setMaxResults(pagesize);
		List<?> list=query.list();

		session.close();

		return list;
	}



}
