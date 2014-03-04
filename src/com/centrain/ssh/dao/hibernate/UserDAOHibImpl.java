package com.centrain.ssh.dao.hibernate;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.centrain.ssh.dao.UserDAO;
import com.centrain.ssh.orm.User;

public class UserDAOHibImpl implements UserDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean addUser(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteUser(int id) {
		try {
			sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().get(User.class, id));
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	public User getUserById(int id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	@SuppressWarnings("unchecked")
	public List<User> getUsersByFenYe(int pageid, int pagesize) {
		Query query=sessionFactory.getCurrentSession().createQuery("from USer");
		query.setFirstResult((pageid-1)*pagesize);
		query.setFetchSize(pagesize);
		return query.list();
	}

	public boolean udpateUser(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false; 
	}

}
