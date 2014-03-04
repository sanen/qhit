<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'select.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	


  </head>
  
  <body>
   <html:form action="/SelectAction" method="post">
		<Table>
			<Tr>
				<td>年龄：</td><td><html:text property="age"></html:text></Td>
			</Tr>
			<Tr>
				<td>性别：</td>
				<td>
					
					<select name="sex">
						<option value="男">男
						<option value="女">女
					</select>
				</Td>
			</Tr>
			<Tr>
				<td>
					<html:submit> 查询</html:submit>
				</Td>
			</Tr>
		</Table>  
</html:form>
  </body>
</html>
