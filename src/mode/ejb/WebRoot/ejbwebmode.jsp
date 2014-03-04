<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Properties"%>
<%@//page import="javax.naming.Context"%>
<%@//page import="javax.naming.InitialContext"%>
<%@//page import="javax.naming.NamingException"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
	    Properties prop=new Properties();
		prop.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
	  	prop.setProperty("java.naming.provider.url", "169.254.0.10:1099");
	  	prop.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming"); 
		
	  	//try {
			//Context ct=new InitialContext();
		 	//Interfaces ejb=(Interfaces)ct.lookup("InterfacesImplemens/local");
		 	//Interfaces ejb=(Interfaces)ct.lookup("InterfacesImplemens/remote");
 		//} catch (NamingException e) {
		//	e.printStackTrace(); 
		//}  
 %> 
</head>
<body>
	
</body>
</html>