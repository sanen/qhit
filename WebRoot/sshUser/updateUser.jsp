<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="html"  uri="http://struts.apache.org/tags-html" %>
<html>
	<head>

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">

	</head>

	<body bgcolor="AEDI">
		<h2 align="center">修改用户页面</h2>  
		<html:form action="/UserAction?method=udpateUser" method="post">
			<Table align="center"> 
				<Tr>                   <html:hidden property="user.id" value="${user.id}"/>
					<td>用户名：</Td><td><html:text property="user.username" value="${user.username}"/> </Td>
				</Tr>
				<Tr>
					<td>密码</Td><td><html:password property="user.password" value="${user.password}"/> </Td>
				</Tr> 
				<Tr>
					<td>年龄</Td><td><html:text property="user.age" value="${user.age}"/> </Td>
				</Tr>
				<Tr> 
					<td>电子邮件</Td><td><html:text property="user.email" value="${user.email}"/> </Td>
				</Tr> 
				<Tr>
					<td><html:submit value="修改"></html:submit> </Td>  
					<td><html:reset value="重置"></html:reset> <a href="/qhit/UserAction.do?method=getUsers">返回</a></Td> 
				</Tr> 
			</Table> 
		</html:form>
	</body>
</html>
