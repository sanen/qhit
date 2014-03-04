<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<html>
  <head>
    

    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	

  </head>
  
  <body bgcolor="pink">
	<logic:equal value="0" scope="session" name="ismanager">
		<H2 align="center">欢迎进入考生页面，你可以进行以下操作</H2>
		<table border="1" cellspacing="1" cellpadding="1" align="center">
			  <tr bgcolor="#000066"> 
			    <td colspan="2" ><strong><font color="#FFFFFF">考生功能</font></strong></td>
			  </tr>
			  <tr bgcolor="#C8D2DF"> 
			    <td>
			    	<ul>
			        	<li><a href="ManagerSubjectsAction.do">进入考试页面</a></li>
			        </ul>
			    </td>
			  </tr>
			
			  <tr bgcolor="#C8D2DF"> 
			    <td>
			    	<ul>
			        	<li><a href="UpdatePasswordAction.do">修改个人密码</a></li>
			        </ul>
			    </td>
			  </tr>
			  <tr bgcolor="#C8D2DF"> 
			    <td>
			    	<ul>
			        	<li><a href="UsersAction.do?method=quitSystem">退出考试系</a></li>
			        </ul>
			    </td>
			    
			  </tr>
		</table>
	</logic:equal>	
	
	<logic:equal value="1" scope="session" name="ismanager">
		
		<H2 align="center">欢迎进入管理员页面，你可以进行以下操作</H2>
		
		<table border="1"  cellspacing="1" cellpadding="1" align="center">
			  <tr bgcolor="#000066"> 
			    <td colspan="2" ><strong><font color="#FFFFFF">管理员功能</font></strong></td>
			  </tr>
			  <tr bgcolor="#C8D2DF"> 
			    <td>
			    	<ul> 
			        	<li><a href="ManagerSubjectsAction.do">管理考试试题</a></li>
			        </ul>
			    </td>
			  </tr>
			  <tr bgcolor="#C8D2DF"> 
			    <td>
			    	<ul>
			        	<li><a href="UsersAction.do?method=getALlUsers">维护考生信息</a></li>
			        </ul>
			    </td>
			  </tr>
			  <tr bgcolor="#C8D2DF"> 
			    <td>
			    	<ul>
			        	<li><a href="UpdatePasswordAction.do">修改个人密码</a></li>
			        </ul>
			    </td>
			  </tr>
			  <tr bgcolor="#C8D2DF"> 
			    <td>
			    	<ul>
			        	<li><a href="UsersAction.do?method=quitSystem">退出考试系</a></li>
			        </ul>
			    </td>
			    
			  </tr>
		</table>
	</logic:equal>	
	
	


  </body>
</html>
