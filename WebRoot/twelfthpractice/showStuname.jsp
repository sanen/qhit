<%@ page language="java"   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
  <head>
    
    <title>JSP page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    

	<base target="left"/>
	
  </head>
    
  <body bgcolor="pink">
	
	 <a href="/qhits309/StudentActions.do?method=query" target="right">查看学员信息</a><br><br>
	 <html:link page="/ForwardAction1.do" target="right">添加学员</html:link>	
	 <a href="/qhits309/ForwardAction1.do" target="right">添加学员a</a>
	 <h3>Student:</h3>
	  
		<c:forEach var="student" items="${list}">
			${student.sid}<a href="/qhits309/StudentActions.do?method=updateStudent&student.sid=${student.sid}" target="right"> ${student.sname}</a><br>
		</c:forEach>
	
	
	<form action="/qhits309/StudentActions.do?method=showStuName" method="post">
			<input type="submit" value="刷新"/>
	</form>
    
	
  </body>
  
</html>
