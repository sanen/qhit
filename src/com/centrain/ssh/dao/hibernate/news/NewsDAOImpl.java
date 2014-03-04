package com.centrain.ssh.dao.hibernate.news;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import com.centrain.ssh.dao.news.NewsDAO;
import com.centrain.ssh.orm.news.News;

/**
 * 
 * @author aa
 *
 */
public class NewsDAOImpl implements NewsDAO {

	private SessionFactory sf=null;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	/**
	 * 
	 */
	public boolean deleteNews(int id) {
		try {
		   sf.getCurrentSession().delete(
			 sf.getCurrentSession().get(News.class, id)	
			);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<News> getNews() {
		return sf.getCurrentSession().createQuery("from News").list();
	}

}
