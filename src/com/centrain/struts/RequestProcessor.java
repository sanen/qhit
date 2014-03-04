package com.centrain.struts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestProcessor extends org.apache.struts.action.RequestProcessor {

	@Override
	public void process(HttpServletRequest arg0, HttpServletResponse arg1)
			throws IOException, ServletException {
		arg0.setCharacterEncoding("gbk");
		super.process(arg0, arg1);
	}

}
