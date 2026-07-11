<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Multiplication Table</title>
</head>
<body>

<h2>Multiplication Table of 5</h2>

<%
int n = 5;

for(int i=1;i<=10;i++)
{
%>

<%= n %> x <%= i %> = <%= n*i %><br>

<%
}
%>

</body>
</html>