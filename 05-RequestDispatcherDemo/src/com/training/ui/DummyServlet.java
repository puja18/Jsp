package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DummyServlet
 */
@WebServlet("/DummyServlet")
public class DummyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("This is dummy servlet");
		String s1 = (String) request.getAttribute("NAME");
		String s2 = (String) request.getAttribute("NATIVE");
		Date d1 = (Date) request.getAttribute("TODAY");
		Integer i1 = (Integer) request.getAttribute("AGE");
		out.println(s1);
		out.println("<br>");
		out.println(s2);
		out.println("<br>");
		out.println(d1);
		out.println("<br>");
		out.println(i1);
		
		request.removeAttribute("NAME");
	}

}
