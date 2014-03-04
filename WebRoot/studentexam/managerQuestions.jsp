<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			   location.href="QuestionsAction.do?method=deleteQuestion&questions.id="+deleteid;
			}
		}
		
	</script>
  </head>
  
  <body bgcolor="pink">
    <h2 align="center">相应考试科目试题</h2>
	<center>
		你选择的科目是：${subjectName} <a href="ManagerSubjectsAction.do">返回操作页面</a><br>
		<table border="1" cellpadding="0" cellspacing="0" width="50%">
			<tr>
				<td align="left">
				 	
					<c:forEach items="${questionset}" var="questions" varStatus="id">
						   <table  width="100%" border="1" align="center" cellpadding="0" cellspacing="0">
								 <Tr bgcolor="<c:if test='${id.index%2==0}'>ADEI</c:if>" > 
								    <td width="45%"><a href="#" onclick="checkDelete(${questions.id }) ">删除</a>题目：</td>
								    <td width="55%">
								     ${questions.question}
								     </td>
								  </tr>
								  <tr>
								    <td>A</td>
								    <td>${questions.answerA } </td>
								  </tr>
								  <tr>                                  
								    <td>B</td>
								    <td>${questions.answerB }</td>
								  </tr>
								  <tr>
								    <td>C</td>
								    <td>${questions.answerC }</td>
								  </tr>
								  <tr>
								    <td>D</td>
								    <td>${questions.answerD }</td>
								  </tr>
								 
								  <tr>
								    <td>正确答案：</td>
								    <td>${questions.rightAnswer }</td>
								  </tr>
							</table> 
							  
				   </c:forEach>
	  			 </td>
	   		</tr>
	   </table>
	   <a href="AddQuestionAction.do">继续添加试题</a>
	</center>
	
  </body>
</html>
