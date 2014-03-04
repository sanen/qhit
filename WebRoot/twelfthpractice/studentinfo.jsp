<%@ page language="java"  pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%//import="java.util.*" %>

<html>
  <head>
    
    <title>JSP page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	
  </head>
  	<script>	
		function checkDelete(id){
			var deleteid=id;
			if(confirm("确定要删除吗？")){
			   location.href="/qhits309/StudentActions.do?method=delete&student.sid="+deleteid;
			}
			
		}
		
	</script>
	
<body bgcolor="pink">
  
 <h2 align="center">所有学员信息</h2>
<Table border="1" align="center" cellpadding="0" cellspacing="0" width="60%">
	<tr align="center">
		<td align="center">编号</Td>
		<td align="center">姓名</Td>
		<td align="center">年龄</Td>
		<td align="center">语文</Td>
		<td align="center">数学</Td>
		<td align="center">操作</td>
	</tr>
	 
	<c:forEach items="${list}" var="score">
  		 	
		<Tr>
			 <td align="center">${score.student.sid} </Td>
			 <td align="center">${score.student.sname} </Td>
			 <td align="center">${score.student.sage} </Td>
			 <td align="center">${score.yewen} </Td>
			 <td align="center">${score.shuxue} </Td>
			 <td align="center">
			 <a href="/qhits309/StudentActions.do?method=updateStudent&student.sid=${score.student.sid}">更新</a>
			 &nbsp;
			${score.student.sid}
			 <a href="#" onclick="checkDelete(${score.student.sid})">删除</a></td>
		</Tr>
	
	</c:forEach>
</Table>  
  	
  	
  			
  			
  			
  	
   
  	<!-- 
  	<br>
  	<logic:iterate id="score" name="list">
		姓名：<bean:write name="score" property="student.sname"/>
		年龄：<bean:write name="score" property="student.sage"/>
		语文：<bean:write name="score" property="yewen"/>
		数学：<bean:write name="score" property="shuxue"/><BR>
		
	</logic:iterate>
    -->
    
  </body>
  
</html>
