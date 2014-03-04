<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="html"  uri="http://struts.apache.org/tags-html" %>
<html>
	<head>

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">

	</head>

	<body bgcolor="ADEI">
		<h2 align="center">添加用户页面</h2>
		<html:form action="/UserAction?method=addUser" method="post">
			<Table align="center">
				<Tr>
					<td>用户名：</Td><td><html:text property="user.username" value=""/><html:errors property="error.username"/> </Td>
				</Tr>
				<Tr>                                                                  
					<td>密码</Td><td><html:password property="user.password"  value=""/><html:errors property="error.password"/><html:errors property="error.passwordLength"/> </Td>
				</Tr> 
				<Tr>
					<td>年龄</Td><td><html:text property="user.age" value=""/> <html:errors property="error.age"/></Td>
				</Tr>
				<Tr>
					<td>电子邮件</Td><td><html:text property="user.email"  value=""/><html:errors property="error.email"/> </Td>
				</Tr>
				<Tr> 
					<td><html:submit value="提交"></html:submit> </Td>
					<td><html:reset value="重置"></html:reset>&nbsp;&nbsp;
						<a href="/qhit/UserAction.do?method=getUsers">查看用户信息</a>
					</Td>
				</Tr>
			</Table> 
		</html:form> 
	</body>
</html>
