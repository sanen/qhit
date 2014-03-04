<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
       
    <title>My JSP 'addPerson.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    


  </head>
  
  <body>
   
    <center>
	  	
	  		<h2>添加学生成绩信息</h2>
	  		<a href="/qhit/PersonAction.do?method=query">查看学员成绩</a><br>
	  		<html:errors property="error.info"/>
			<html:form action="/PersonAction" method="post">
					<html:hidden property="method" value="insert"/>
					<html:hidden property="operation" value="insert"/>
					<Table border="1">
						<Tr>
							<td>用户名：</Td><td><html:text property="person.username"></html:text> </Td>
						</Tr>
						<Tr>
							<td>密码：</Td><td><html:password property="person.passwrod"></html:password> </Td>
						</Tr>
						
						<Tr>
							<td align="center" colspan="2"><html:submit value="添加" ></html:submit> <html:reset value="重置"/></Td>
						</Tr>
					</Table>  
	  		</html:form>
	  		
	  		<hr width="250" align="center">
	  	   
	  	   <html:form action="PersonAction.do" method="post"> 
	  	   		<Table border="1" cellpadding="0" cellspacing="0">
					<Tr>
						<td>&nbsp;</td>
						<td>用户名</Td>
						<td>密码</Td>
					</Tr> 
					<c:forEach items="${list}" var="student" varStatus="id">
	 					<tr>
							<td><input type="checkbox" name="ids" value="${student.id}"/></td>
							<td>${student.username}</Td> 
							<td>${student.passwrod}</Td> 
						</tr>
					</c:forEach>
				</Table>
				
				<input type="submit" name="method" value="delete"/>
			</html:form>
	
	    </center>

  </body>
</html>
