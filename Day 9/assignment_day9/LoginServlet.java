package com.coforge.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		if(Username.equals("admin") && Password.equals("123")) {
			HttpSession Session = request.getSession();
			Session.setAttribute("username", Username);
			
			Cookie cookie =new Cookie("username",Username);
			response.addCookie(cookie);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("LoginSuccess.jsp");
			dispatcher.in.forward(request, response);
			//response.sendRedirect("LoginSuccess.jsp");
		} else {
			response.sendRedirect("LoginFailure.jsp");
		}
		out.close();
 	}

}
