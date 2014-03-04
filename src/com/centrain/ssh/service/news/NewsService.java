package com.centrain.ssh.service.news;

import java.util.List;

import com.centrain.ssh.orm.news.News;

/**
 * 
 * @author aa
 *
 */
public interface NewsService {

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
