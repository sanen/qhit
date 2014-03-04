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
	  
	  	<h2 align="center">清华IT在线模拟考试系统</h2>   
	    <center>请您先登录系统。<!-- <a href="ForwardAction.do">考生注册</a> --> </center>
	    
		<html:form action="/UsersAction" method="post">
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
							<html:submit value="登录" onclick="document.forms[0].method.value='userLogin'"/>
							<html:submit value="注册" onclick="document.forms[0].method.value='addUsers'"/>
						    <html:reset value="重置"></html:reset> 
					    </Td>
					</Tr>
					<tr>  
						<td colspan="2"  align="center">
							<input type=button value="关闭窗体" onClick="javascript:self.close();" onKeyPress="javascript:self.close();">
						</td>
					</tr>
				</Table> 
		</html:form>
		
		
	</body>
</html>
