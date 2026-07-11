package com.coforge.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/area")
public class AreaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        double side = Double.parseDouble(request.getParameter("side"));

        double area = side * side;

        request.setAttribute("side", side);
        request.setAttribute("area", area);

        RequestDispatcher rd =
                request.getRequestDispatcher("arearesult.jsp");

        rd.forward(request, response);
    }
}