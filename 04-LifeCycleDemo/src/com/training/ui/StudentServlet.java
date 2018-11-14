package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet(
		urlPatterns = { "/StudentServlet" }, 
		initParams = { 
				@WebInitParam(name = "i_rollno", value = "105"), 
				@WebInitParam(name = "i_name", value = "puja"), 
				@WebInitParam(name = "i_age", value = "21")
		})
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int rollNo;
	private String name;
	private int age;

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
		out.println(this.rollNo + "<br>");
		out.println(this.name + "<br>");
		out.println(this.age + "<br>");
	}
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	ServletConfig config = getServletConfig();
    	String strRoll = config.getInitParameter("i_rollno");
    	String strName = config.getInitParameter("i_name");
    	String strAge = config.getInitParameter("i_age");
    	this.rollNo = Integer.parseInt(strRoll);
    	this.name = strName;
    	this.age = Integer.parseInt(strAge); 
    }
}
