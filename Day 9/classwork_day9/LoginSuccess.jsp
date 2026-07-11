<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file = "login.html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color = 'green'>Welcome <%= session.getAttribute("username") %></font>
<%
Cookie[] cookies = request.getCookies();
out.println("<p><b><font color = 'green'>Welcome " + cookies[1].getValue() + "</font></b></p>");
%>
</body>
</html>