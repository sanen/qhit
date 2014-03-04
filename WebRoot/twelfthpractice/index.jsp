<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%//import="java.util.*" %>

<html>
  <head>
    
    <title>JSP page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">     
	
  </head>
  
  <frameset cols="30%,*" style="color:pink">
		
		<frame scrolling="auto" src="showStuname.jsp"  name="left" noresize="noresize"></frame>
		
		<frame scrolling="auto" src="right.jsp" name="right"></frame>
		
	</frameset>
     
     <!-- 
     	<frame scrolling="auto" src="showStudent.jsp" name="showStudent"></frame>
      -->
      
</html>
