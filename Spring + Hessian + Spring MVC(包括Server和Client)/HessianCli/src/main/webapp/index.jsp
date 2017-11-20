<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>测试Hessian</title>
  </head>
  
    <body>
    <div style="TEXT-ALIGN: center;MARGIN-RIGHT: auto; MARGIN-LEFT: auto; ">
		<form action="login" method="post">
			<div>
				<label for="name">姓名:</label> <input class="easyui-validatebox"
					type="text" name="name" data-options="required:true" />
			</div>
			<div>
				<label for="email">邮箱:</label> <input class="easyui-validatebox"
					type="text" name="email" data-options="validType:'email'" />
			</div>
			<div>
				<button type="submit">登录</button>
			</div>
		</form>
	</div>
  </body>
</html>
