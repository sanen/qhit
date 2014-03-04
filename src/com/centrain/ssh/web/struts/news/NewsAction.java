package com.centrain.ssh.web.struts.news;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.centrain.ssh.service.news.NewsService;

/**
 * 
 * @author aa
 *
 */
public class NewsAction extends DispatchAction {

	 
	private NewsService newsService=null;

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
 
	/**
	 * 
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @return
	 * @throws Exception
	 */
	public ActionForward query(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
	
		arg2.setAttribute("news", newsService.getNews());
		return new ActionForward("/news/news_list.jsp");
	}
	
	/**
	 * 
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @return
	 * @throws Exception
	 */
	public ActionForward delete(ActionMapping arg0, ActionForm arg1,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
		
		arg3.setContentType("text/html;charset=UTF-8");
		
		int id=Integer.parseInt(arg2.getParameter("id"));
		
		String s="";
		arg3.setContentType("text/html;charset=utf-8") ;
		if(newsService.deleteNews(id)){
			//É¾³ý³É¹¦
			s="<script>alert('É¾³ý³É¹¦');location.href='NewsAction.do?method=query'</script>"; 
			System.out.println("ok");
		}else{
			//É¾³ýÊ§°Ü
			s="<script>alert('É¾³ýÊ§°Ü');location.href='NewsAction.do?method=query'</script>";
			System.out.println("sorry");
		}
		arg3.getWriter().println(s);  
		return null;
	}
	 
	
}
