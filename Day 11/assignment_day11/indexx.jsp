<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
<link rel="stylesheet" href="empStyle.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src = "./AjaxScript.js"></script>
</head>
<body>
	<div class="header">
		<h1>Employee Management System</h1>
	</div>
	<br>
	<form action = "EmployeeController" method = "post">
	<div class="content">
		<table>
			<tr>
			<td>Employee ID : </td>
			<td><input type = "text" align = "center" id = "eid" name = "eid" onblur = "getEmployeeDetails()"/></td>
			</tr>
			<tr>
			<td>Employee Name : </td>
			<td><input type = "text" align = "center" name = "ename"/></td>
			</tr>
			<tr>
			<td>Employee Salary : </td>
			<td><input type = "text" align = "center" name = "esalary"/></td>
			</tr>
			<tr>
			<td>Department Number : </td>
			<td><input type = "text" align = "center" name = "dno"/></td>
			</tr>
			<tr>
				<td colspan = "2" align = "center" ><input type="submit" value="login.in" ></td>
			</tr>
		</table>
		<br>
		<input type = "submit" value = "Insert" class = "btn-primary" align = "center" name = "emsButton"/>
		<input type = "submit" value = "Delete" class = "btn-danger" align = "center" name = "emsButton"/>
		<input type = "submit" value = "Update" class = "btn-warning" align = "center" name = "emsButton"/>
		<input type = "submit" value = "Find" class = "btn-success" align = "center" name = "emsButton"/>
		<input type = "submit" value = "FindAll" class = "btn-info" align = "center" name = "emsButton"/><br>
	</div>
	</form>
	
	<div class = "alert alert-primary">
	<%= request.getParameter("result") %>
	
	
	</div>
</body>
</html>