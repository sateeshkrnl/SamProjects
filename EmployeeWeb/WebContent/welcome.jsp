<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div id="headerDiv" style="background-color:olive;border-style:solid;border-width:1px;width:1200px;height:50px"></div>
	<div id="loginDiv"
		style="width: 300px; height: 150px; border-style: solid; border-width: 2px; position: absolute; right: 150px; bottom: 150px; top: 200px; left: 500px;">

		<table
			style="top: 20px; left: 30px; bottom: 150px; right: 150px; position: relative;">
			<tr>
				<td align="center" colspan="2">Login Page</td>
			</tr>
			<tr>
				<td colspan="1">User Name:</td>
				<td colspan="1"><input name="userName" type="text" value="" /></td>
			</tr>
			<tr>
				<td colspan="1">Password:</td>
				<td colspan="1"><input name="password" type="password" /></td>
			</tr>
			<tr>
				<td colspan="1"></td>
				<td colspan="1">
				<input name="submitBtn" type="submit" disabled="disabled" value="Login" /> 
				<input name="submitBtn"	type="reset" value="Reset" /></td>
			</tr>
		</table>
	</div>
	<div id="footerDiv" style="background-color:olive;border-style:solid;border-width:1px;width:1200px;height:50px;position:absolute;top:500px"></div>
</body>
</html>