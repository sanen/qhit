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
		function check(){
		  var subjectid=document.forms[0].subject_id.value;
		 
		  if(subjectid!=null){
		  	 document.forms[0].submit();
		  }else{
		  	 alert("请选择科目");
		  	 return;
		  }
		} 
	</script>
  </head>
  
  <body bgcolor="pink">
  
     <h2 align="center">考试科目管理页面</h2>
    
	  <html:form action="SubjectAction.do?method=getQuestionsBySubjectByid" method="post">	
			
			<h5>基础学科类：</h5><br>
				<input type="radio" name="subject.id" value="1" checked="checked"/>语文
				<input type="radio" name="subject.id" value="2" />数学
				<input type="radio" name="subject.id" value="3" />英语<br><br>
			
			<h5>软件开发类：</h5><br>
				<input type="radio" name="subject.id" value="4" />Java面向对象编程
				<input type="radio" name="subject.id" value="5" />JSP网络编程
				<input type="radio" name="subject.id" value="6" />J2EE高级Web应用编程<br><br>
			
			<input type="button" value="上一步" onclick="location.href='userfunctionlist.jsp' "/>
			<input type=submit value="下一步"/><a href="FunctionAction.do">返回</a>
			
		</html:form>
		
		
		
		
  </body>
</html>
