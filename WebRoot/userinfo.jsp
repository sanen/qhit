<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<html>
  <head>
   
 	<title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	
	<script>	
		function checkDelete(id){
			var deleteid=id;
			if(confirm("确定要删除吗？")){
			   location.href="StudentAction.do?method=delete&student.id="+deleteid;
			}
		}
		
	</script>

  </head>
  
  <body>

	<center><h2>this is userinfo jsp</h2> </center>

<Table align="center" border="1">
	<tr>
		<th>班级</th>
		<th>学员姓名</th>
		<th>语文成绩</th>
		<th>数学成绩</th>
		<th>英语成绩</th>
		<th>总分</th>
		<th>操作<a href="ForwardAction.do">添加</a></th>
	</tr>
      
    <c:forEach items="${list}" var="student" varStatus="id">
		<Tr bgcolor="<c:if test="${id.index%2==0}">pink</c:if>">
			<td>${student.className}</Td>
			<td>${student.studentName}</Td>
			<td>${student.chineseMarks}</Td>
			<td>${student.mathMarks}</Td>
			<td>${student.englishMarks}</Td>
			<td>${student.chineseMarks+student.mathMarks+student.englishMarks}</Td>
			<td>
				<a href="StudentAction.do?method=selectById&student.id=${student.id}" >修改</a>
				<a href="#" onclick="checkDelete(${student.id})">删除</a>
			</td>
		</Tr>
	</c:forEach>
	
	
</Table> 
	<center>
		<form action="ForwardAction.do" method="post">
			<input type="submit" value="继续添加"/>
		</form>
	</center>


  </body>
</html>
