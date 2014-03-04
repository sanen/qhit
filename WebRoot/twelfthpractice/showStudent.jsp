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
  
  <body bgcolor="pink">
  	
  	<h2 align="center"><font color="red">${student.sname}</font>学员详细信息 </h2>
	
	<html:form action="/StudentActions?method=update" method="post" >
				
				<html:hidden property="student.sid" value="${student.sid}"/>
				<html:hidden property="score.score_id" value="${score.score_id}"/>
				<Table border="1" cellpadding="0" cellpadding="0" align="center">
						
						<Tr>
							<td>姓  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</Td><td><html:text property="student.sname" value="${student.sname}"/></Td>
						</Tr>
						
						<Tr>
							<td>年  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：</Td><td><html:text property="student.sage" value="${student.sage}"/></Td>
						</Tr>
						
						<Tr>
							<td>语文成绩：</Td><td><html:text property="score.yewen" value="${score.yewen}"/></Td>
						</Tr>
						
						<Tr>
						
							<td>数学成绩：</Td><td><html:text property="score.shuxue" value="${score.shuxue}"/></Td>
						</Tr>
						
						<Tr>
							<td colspan="2" align="center">
								<html:submit value="修改"></html:submit>
								 &nbsp;&nbsp;&nbsp;
								<html:reset>取消</html:reset>
								
							</Td>
						</Tr>
						<tr>
							<td colspan="2" align="center"> 
								<html:button property="" value="继续添加" onclick="location.href='ForwardAction1.do' "></html:button> 
							</td>
						</tr>
						
				</Table> 
				
		</html:form> 
    

  </body>
  
</html>
