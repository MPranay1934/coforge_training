<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Scripting Elements</title>
</head>
<body>

<h2>Declaration</h2>

<%!
int a = 10;

public int square(int n){
    return n*n;
}
%>

<h2>Scriptlet</h2>

<%
int b = 20;
int sum = a + b;
%>

<h2>Expression</h2>

Value of a = <%= a %><br>

Value of b = <%= b %><br>

Sum = <%= sum %><br>

Square of 5 = <%= square(5) %>

</body>
</html>