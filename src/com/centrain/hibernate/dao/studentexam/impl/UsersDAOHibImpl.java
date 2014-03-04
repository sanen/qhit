 
package com.centrain.hibernate.dao.studentexam.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.centrain.hibernate.dao.studentexam.UsersDAO;
import com.centrain.hibernate.model.studentexam.Users;

import com.centrain.hibernate.dao.impl.BaseDAO;
public class UsersDAOHibImpl extends BaseDAO implements UsersDAO {

	private final String hibernateCfgXmlName="hibernate.studentexam.cfg.xml";

	/** 1
	 * 锟斤拷锟斤拷没锟� 注锟斤拷
	 * @param users
	 * @return true 锟斤拷映晒锟斤拷锟街э拷锟�
	 */
	public boolean addUsers(Users users) {
		//锟斤拷锟斤拷锟酵拷没锟斤拷锟斤拷锟矫伙拷锟斤拷锟斤拷 true 锟斤拷锟斤拷锟� 锟斤拷之锟斤拷锟�
		if(!this.checkUsersExist(users.getUsername())){
			return super.insertBoolean(users,hibernateCfgXmlName);
		}
		return false;
	}
	
	/** 2
	 * 删锟斤拷锟斤拷没锟�
	 * @param id
	 * @return true 删锟斤拷晒锟� 锟斤拷之失锟斤拷
	 */
	public boolean deleteUsers(int id) {
		return super.deleteBoolean(Users.class, id,hibernateCfgXmlName);
	}
	
	/** 3
	 * 锟睫革拷锟矫伙拷锟斤拷锟斤拷
	 * @param users
	 * @return true 锟睫改成癸拷锟斤拷之失锟斤拷
	 */
	public boolean updatePassword(Users users) {
		Session session=new Configuration().configure(hibernateCfgXmlName).buildSessionFactory().openSession();
		try {
			session.update(users);
			session.beginTransaction().commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		} 
		return false;
	}
	
	/** 4
	 * 锟斤拷取锟斤拷锟叫碉拷锟矫伙拷锟斤拷息
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Users> getALlUsers() {
		return (List<Users>) super.getAll("Users",hibernateCfgXmlName); 
	}
	
	/** 5
	 * 锟斤拷锟斤拷锟酵拷没锟斤拷锟斤拷锟矫伙拷锟角凤拷锟斤拷锟�
	 * @param username
	 * @return
	 */
	public boolean checkUsersExist(String username) {
		
		Session session=new Configuration().configure(hibernateCfgXmlName).buildSessionFactory().openSession();
		
		try {
			Query query=session.createQuery("from Users where username=?");
			query.setString(0, username);
			if(query.list().size()>0){
				return true;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return false;
	}

	/** 6
	 * 锟矫伙拷锟斤拷录
	 * null 锟斤拷锟较凤拷锟斤拷录
	 * users.getIsmanager()=0 锟较凤拷锟斤拷录 锟斤拷锟斤拷锟�
	 * users.getIsmanager()=1 锟较凤拷锟斤拷录 锟斤拷锟斤拷员锟斤拷锟斤拷
	 */
	@SuppressWarnings("unchecked")
	public Users userLogin(Users users) {
		
		Session session=new Configuration().configure(hibernateCfgXmlName).buildSessionFactory().openSession();
			
		try {
			Query query=session.createQuery("from Users where username=? and password=?");
			query.setString(0, users.getUsername());
			query.setString(1, users.getPassword());
			@SuppressWarnings("unused")
			List<Users> list=query.list();
			if(list.size()>0){
				for(Users user:list){
					return user;
				}
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return null;
	}
	
	/** 7
	 * 锟斤拷取锟斤拷锟斤拷锟矫伙拷锟斤拷锟斤拷息
	 * 锟睫革拷锟矫伙拷前锟斤拷锟矫伙拷锟斤拷息
	 */
	public Users getUserById(int id) {
		return (Users) super.get(Users.class, id,hibernateCfgXmlName);
	}

}
