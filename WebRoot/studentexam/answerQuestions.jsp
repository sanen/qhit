<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	
	<center>你选择的科目是：${subjectName } <a href="ManagerSubjectsAction.do"> 返回选择科目界面</a></center>
	
	<br> 
	
		<c:forEach items="${questionset}" var="questions">
		 <html:form action="/QuestionsAction?method=answer"  method="post">
		    <table  border="1" align="center" cellpadding="0" cellspacing="0">
				  <tr> 
				    <td>试题编号${questions.id } 题目：</td>
				    <td>
				     ${questions.question}
				     </td>
				  </tr>
				  <tr>  <html:hidden property="questions.id" value="${questions.id}"/>
				    <td><html:radio property="questions.rightAnswer" value="A">A</html:radio></td>
				    <td>${questions.answerA } </td>
				  </tr>
				  <tr>
				    <td><html:radio property="questions.rightAnswer" value="B">B</html:radio></td>
				    <td>${questions.answerB }</td>
				  </tr>
				  <tr>
				    <td><html:radio property="questions.rightAnswer" value="C">C</html:radio></td>
				    <td>${questions.answerC }</td>
				  </tr>
				  <tr>
				    <td><html:radio property="questions.rightAnswer" value="D">D</html:radio></td>
				    <td>${questions.answerD }</td>
				  </tr>
				 
				  <tr>
				    <td><html:submit value="提交"/> </td>
				    <td><html:reset value="重置"/> </td>
				  </tr>
			</table> 
		</html:form>
	</c:forEach>
  </body>
</html>
