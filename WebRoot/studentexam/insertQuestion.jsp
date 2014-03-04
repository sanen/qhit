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
	
	 <h2 align="center">添加/答题考试科目试题</h2>
	 <center>
	    	 
	     科目：${subjectName }&nbsp;&nbsp;<a href="FunctionAction.do">返回</a>
	    <html:form action="/QuestionsAction?method=addQuestion"  method="post">
			<html:hidden property="subject.id" value="${subject_id}"/>
		    <table  border="1" align="center" cellpadding="0" cellspacing="0">
				  <tr> 
				    <td>题目：</td>
				    <td>
				      <html:textarea property="questions.question"/><html:errors property="error.question"/>
				     </td>
				  </tr>
				  <tr>
				    <td>答案A:</td>
				    <td><html:text property="questions.answerA" /><html:errors property="error.answerA"/> </td>
				  </tr>
				  <tr>
				    <td>答案B:</td>
				    <td><html:text property="questions.answerB"/><html:errors property="error.answerB"/></td>
				  </tr>
				  <tr>
				    <td>答案C:</td>
				    <td><html:text property="questions.answerC"/><html:errors property="error.answerC"/></td>
				  </tr>
				  <tr>
				    <td>答案D:</td>
				    <td><html:text property="questions.answerD"/><html:errors property="error.answerD"/></td>
				  </tr>
				  <tr>
				    <td>正确答案：</td>
				    <td>
					<html:radio property="questions.rightAnswer" value="A">A</html:radio>
					<html:radio property="questions.rightAnswer" value="B">B</html:radio>
					<html:radio property="questions.rightAnswer" value="C">C</html:radio>
					<html:radio property="questions.rightAnswer" value="D">D</html:radio>
					<html:errors property="error.rightAnswer"/>
				    </td>
				  </tr>
				  <tr>
				    <td><html:submit value="提交"/> </td>
				    <td><html:reset value="重置"/> </td>
				  </tr>
			</table> 
		</html:form>
	 </center>
  </body>
</html>
