package com.biblio.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@SuppressWarnings("serial")
public class HelloWorldServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strResponse = "/jsp/servlets/hello-servlet.jsp";
		String name = request.getParameter("name");
		
		if(name != null && !name.isEmpty()){
			strResponse += "?message=" + name;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(strResponse);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
