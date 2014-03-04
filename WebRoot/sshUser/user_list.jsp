<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html> 
	<head>

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
	
		<script>	
			function checkDelete(id){
				var deleteid=id; 
				if(confirm("确定要删除吗？")){
				   location.href="UserAction.do?method=deleteUser&user.id="+deleteid;
				}
			}
			
		</script>
	</head>

	<body bgcolor="AEDI">
		<h2 align="center">用户信息页面</h2>
		<p align="center" style="color: AEID"><a href="sshUser/insertUser.jsp">添加用户</a></p>
		<Table align="center" border="1" cellpadding="0" cellspacing="0">
			<Tr>
				<th>编号</Th><th>用户名</Th><th>年龄</Th><th>电子邮件</Th><th>操作</Th>
			</Tr> 
			<c:forEach items="${users}" var="user">
				<Tr>
					<td>${user.id}</Td>
					<td>${user.username } </Td>
					<td>${user.age } </Td>
					<td>${user.email} </Td>
					<td><a href="#" onclick="checkDelete(${user.id })">删除</a> 
					<a href="UserAction.do?method=getUserById&user.id=${user.id}">修改</a></td>  
				</Tr> 
			</c:forEach> 
		</Table> 	
 

	</body>
</html>
