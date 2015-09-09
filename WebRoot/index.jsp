<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   	<form action="come.action" method="post">  
  
        <table align="left" width="50%" border="0" cellpadding="0"  
            cellspacing="0">  
  
            <tr>  
                <td></td>  
            </tr>  
            <tr>  
  
                <td height="30" bgcolor="" align="center" valign="middle">用户名：</td>  
                <td align="left" height="30" valign="middle"><input  
                    style="width: 150px" type="text" name="username" value=""></input></td>  
  
            </tr>  
  
  
            <tr>  
                <td height="30" bgcolor="" align="center" valign="middle">密 码：</td>  
                <td align="left" height="30" valign="middle"><input  
                    style="width: 150px" type="password" name="password" value=""></input></td>  
            </tr>  
  
            <tr>  
                <td align="right"><input type="submit" name="button" value="提交"></input></td>  
            </tr>  
        </table>  
    </form>  
  </body>
</html>
