<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h4>添加學生信息</h4>
	<hr>
	<form action="add" method="post">
	<table>
		<tr>
			<td>學生編號</td><td><input type="text" name="stuNo"> </td><td>學生姓名</td><td><input type="text" name="stuName"> </td>
		</tr>
		<tr>
		<td>性別</td><td><input type="text" name="gender"> </td><td>年龄</td><td><input type="text" name="age"> </td>
		</tr>
		<tr>
		<td>成绩</td><td><input type="text" name="score"> </td>
		</tr>
		<tr>
			<td><input type="submit" value="提交"></td><td><input type="reset" value="重置"> </td>
		</tr>
		
		
	</table>
	</form>
	</div>
</body>
</html>