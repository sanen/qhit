package com.centrain.struts.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.centrain.struts.form.SelectActionForm;
//where 条件查询 后 登录用户信息
public class SelectAction extends Action {
	
	@SuppressWarnings("unchecked")
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	
		SelectActionForm sf=(SelectActionForm)form;
		
		response.setContentType("text/html;charset=gbk");
		response.setCharacterEncoding("gbk");
		PrintWriter out=response.getWriter();
		
		int age=sf.getAge();
		String sex=sf.getSex();
		System.out.println(sf.getSex());
		
		Configuration cf=new Configuration().configure();
		
		SessionFactory sessionFactory=cf.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		try {
			
			Query query=session.createQuery("from SelectActionForm as s "+"where s.age>"+age+"and s.sex='"+sex+"'");
			
			List list=query.list();
			
			for (int i = 0; i <list.size(); i++) {
				SelectActionForm ss=(SelectActionForm)list.get(i);
				out.println(ss.getUsername()+"|"+ss.getAge()+"|"+ss.getSex()+"<br>");
			}
			
			tx.commit();
			
		} catch (RuntimeException e) {
			tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		return null;
	}

}
