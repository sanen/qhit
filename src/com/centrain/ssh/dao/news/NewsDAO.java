package com.centrain.ssh.dao.news;

import java.util.List;

import com.centrain.ssh.orm.news.News;

/**
 * 
 * @author aa
 *
 */
public interface NewsDAO {

	/**
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteNews(int id);
	
	/**
	 * 
	 * @return
	 */
	public List<News> getNews();
}
