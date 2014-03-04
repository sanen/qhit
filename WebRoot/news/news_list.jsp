<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<html>  
	<head>

		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		
		<script>
			function checkDelete(id){
				if(confirm("你确定要删除本条信息吗")){
					location.href='NewsAction.do?method=delete&id='+id;
				}  
			} 
		</script>
	</head>

	<body bgcolor="AEDI">
		<h2 align="center"><br></h2><h2 align="center">IT 咨询新闻系统信息列表</h2>
		
		<Table border="1" cellpadding="0" cellspacing="0" align="center">
			<Tr>
				<th>
					id
				</Th>
				<th>
					title
				</Th>
				<th>
					content
				</th>
				<th>
					begintime
				</th>
				<th>
					username
				</th>
				<th>
					删除
				</th>
			</Tr>
			<c:forEach items="${news}" var="new">
				<Tr>
					<td>
						${new.id} 
					</Td>
					<td>
						${new.title} 
					</Td>
					<td>
						${new.content }
					</Td>
					<td>
						<fmt:formatDate value="${new.begintime}" pattern="yyyy-MM-dd"/>
					</Td>
					<td>
						${new.username }
					</Td>
					<td>
						<input type="button" value="删除" onclick="checkDelete(${new.id })">
					</Td>
				</Tr>
			</c:forEach>
		</Table>

	</body>
</html>
