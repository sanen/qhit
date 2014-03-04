package com.centrain.ssh.service.spring.news;

import java.util.List;

import com.centrain.ssh.dao.news.NewsDAO;
import com.centrain.ssh.orm.news.News;
import com.centrain.ssh.service.news.NewsService;

/**
 * 
 * @author aa
 *
 */
public class NewsServiceImpl implements NewsService {

	private NewsDAO newsDAO=null;
	
	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}
	/**
	 * 
	 */
	public boolean deleteNews(int id) {
		return newsDAO.deleteNews(id);
	}
	/**
	 *  
	 */
	public List<News> getNews() {
		return newsDAO.getNews();
	}

}
