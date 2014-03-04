<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    

    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	

  </head>
  
  <body bgcolor="pink">
     <h2 align="center">管理用户信息</h2>
	<center>
		<h4>以下是所有注册的学生<a href="FunctionAction.do">返回</a></h4>
		<Table border="1" cellspacing="1" cellpadding="1" align="center">
			<Tr>
				<th>考生姓名</th><th>操作</th>
			</Tr> 
			<c:forEach items="${userslist}" var="users">
				<Tr>
					<td>${users.username}</Td><td><a href="UsersAction.do?method=deleteUsers&users.id=${users.id}">删除</a></Td>
				</Tr>
			</c:forEach>
		</Table> 
		<a href="ForwardAction.do">添加学生</a>	
	</center>

  </body>
</html>
