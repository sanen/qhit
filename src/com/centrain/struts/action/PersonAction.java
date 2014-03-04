package com.centrain.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.centrain.hibernate.model.Person;
import com.centrain.hibernate.service.PersonService;
import com.centrain.hibernate.service.impl.PersonServiceImpl;
import com.centrain.struts.form.PersonForm;


public class PersonAction extends DispatchAction {

	PersonService personService=new PersonServiceImpl();
	
	public ActionForward insert(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
//		System.out.println("*******insert*********");
		
		PersonForm personForm=(PersonForm)form;
		
		Person person=personForm.getPerson();
		
		if(personService.insert(person)>0){
			servlet.getServletContext().setAttribute("person", person);
			return arg0.findForward("update");
		}
		return this.query(arg0, form, arg2, arg3);
	}
	
	public ActionForward delete(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
//		System.out.println("*******delete*********");
		
		
//		String[] ids=arg2.getParameterValues("ids");
		PersonForm personForm=(PersonForm)form;
		
		int ids[]=personForm.getIds();
		
//		if(!ids.equals("")){
//			for (int i = 0; i < ids.length; i++) {
//				int id=Integer.parseInt(ids[i]);
//				personService.delete(id);
				personService.delete(ids);
//			}
//		}
		
		
		return this.query(arg0, form, arg2, arg3);
	}
	
	public ActionForward update(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
//		System.out.println("*******update*********");
		
		PersonForm personForm=(PersonForm)form;
		Person person=personForm.getPerson();
		if(personService.update(person)>0){
			
			return this.query(arg0, form, arg2, arg3);
		}
		return arg0.findForward("update");
	}
	
	public ActionForward query(ActionMapping arg0, ActionForm form,
			HttpServletRequest arg2, HttpServletResponse arg3) throws Exception {
//		System.out.println("*******query*********");
		
		List<Person> list=personService.getQuery();
		servlet.getServletContext().setAttribute("list", list);
		return arg0.findForward("add");
	}

	
	
	
}
