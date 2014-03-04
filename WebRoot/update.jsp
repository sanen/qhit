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

  </head>
  
  <body bgcolor="pink">

<center>
	  		<h2>更新学生成绩信息</h2>
			<html:form action="/StudentAction" method="post">	
				<html:hidden property="method" value="update"/> 
				${student.id}
				<html:hidden property="student.id"  value="${student.id}"/>
				<Table border="1">
					     <Tr>
							<td>班级：</Td><td><html:text property="student.className" value="${student.className}" ></html:text></Td>
						</Tr>
						<Tr>
							<td>姓名：</Td><td><html:text property="student.studentName" value="${student.studentName}"></html:text> <html:errors property="studentName"/></Td>
						</Tr>
						<Tr>
							<td>语文：</Td><td><html:text property="student.chineseMarks" value="${student.chineseMarks}"></html:text><html:errors property="chineseMarks"/></Td>
						</Tr>
						<Tr>
							<td>数学：</Td><td><html:text property="student.mathMarks" value="${student.mathMarks}"></html:text><html:errors property="mathMarks"/></Td>
						</Tr>
						<Tr>
							<td>英语：</Td><td><html:text property="student.englishMarks" value="${student.englishMarks}"></html:text> <html:errors property="englishMarks"/></Td>
						</Tr>
						<Tr>
							<td align="center" colspan="2">p<html:submit value="更新" ></html:submit> 
								<html:reset value="重置"/>
								<html:button property="cancel" value="取消"  onclick="location.href='StudentAction.do?method=select' "></html:button>
							</Td>
						</Tr>
				</Table>  
	  		</html:form>
	    </center>


  </body>
</html>
