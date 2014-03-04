<%@ page language="java"  pageEncoding="UTF-8"%>

<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<html>
  <head>
    

    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	

  </head>
  
  <body bgcolor="pink">
 	<h2 align="center">修改个人密码页面${usersLogin.id}</h2> 
 	<center><html:errors property="error.updatepassword"/></center>
	<html:form action="/PasswordAction?method=updatePassword" method="post">  
		<Table align="center" border="1" cellpadding="0" cellspacing="0">  
			<Tr>
				<!-- 旧密码 1 是直接载入？  2还是有用户输入？ -->
				<td>旧密码：</Td>
				<td><html:hidden property="users.id" value="${usersLogin.id}"/>          												   
					<html:password property="users.password"/><html:errors property="error.lastpassword"/><html:errors property="error.notpassword"/> 
				</Td>
			</Tr>
			<Tr>
				<td>新密码：</Td><td><html:password property="password.newpassword" /><html:errors property="error.newpassword"/></Td>
			</Tr>
			<Tr>
				<td>重复新密码：</Td><td><html:password property="password.repeatnewpassword"/><html:errors property="error.repeatnewpassword"/></Td>
			</Tr>
			<tr>
				<td colspan="2" align="center">
					<html:submit value="提交" />
				    <html:reset value="重置" /> 
				    <input type="button" value="取消" onclick="location.href='userfunctionlist.jsp' ">
				    <a href="FunctionAction.do">返回</a>
			    </Td>
			</tr>
		</Table>  
	</html:form>
  </body>
</html>
