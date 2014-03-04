<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%//import="java.util.*" %>

<html>
  <head>
    
    <title>JSP page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	
	<base target="right" />
	 
  </head>
  
  <body bgcolor="pink">
  
  <center>  
  		  <h2>添加学生信息</h2>
  		  
		  <html:form action="/StudentActions?method=insert" method="post">
				
				<Table border="1" cellpadding="0" cellpadding="0">
						
						<Tr>
							<td>姓  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</Td><td><html:text property="student.sname"/></Td>
						</Tr>
						
						<Tr>
							<td>年  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：</Td><td><html:text property="student.sage"/></Td>
						</Tr>
						
						<Tr>
							<td>语文成绩：</Td><td><html:text property="score.yewen"/></Td>
						</Tr>
						
						<Tr>
							<td>数学成绩：</Td><td><html:text property="score.shuxue"/></Td>
						</Tr>
						
						<Tr>
							<td colspan="2" align="center">
								<html:submit>添加</html:submit>&nbsp;&nbsp;&nbsp;<html:reset>取消</html:reset> 
							</Td>
						</Tr>
						
				</Table> 
		</html:form> 
		
  
    <!-- 
	    <a href="/qhits309/StudentActions.do?method=insert">ok</a><br>
	    <a href="/qhits309/StudentActions.do?method=updateStudent">查询出单个学员信息</a><br>
		<a href="/qhits309/StudentActions.do?method=showStuName">显示学员姓名</a><br>
		<a href="/qhits309/StudentActions.do?method=update">修改学员信息</a><br>
		<a href="/qhits309/StudentActions.do?method=delete">删除学员信息</a><br>
	 -->
	 
</center>
  </body>
  
</html>
