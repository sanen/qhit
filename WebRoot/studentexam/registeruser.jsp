<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

<html>
  <head>
    

    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	

  </head>
  
  <body bgcolor="pink">
    	
    	<h2 align="center">考生注册</h2>
    	    
		<html:form action="/UsersAction?method=addUsers" method="post">
				<Table align="center" cellpadding="0" cellspacing="0" border="1"> 
					<Tr>
						<td>用户名：</Td><td><html:text property="users.username" /><html:errors property="error.username"/> </Td>
					</Tr>
					<Tr>
						<td>密码：</Td><td><html:password property="users.password"/><html:errors property="error.password"/></Td>
					</Tr>
					<Tr>
						<td colspan="2" align="center">
							<input type="hidden" name="method"/>
							<html:submit value="注册"/>
						    <html:reset value="重置"/> 
						    <a href="FunctionAction.do">返回</a>
					    </Td>
					</Tr>
				</Table> 
		</html:form>

  </body>
</html>
