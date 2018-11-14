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
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double salary;

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
	    out.println(this.id + "<br>");
	    out.println(this.name+ "<br>");
	    out.println(this.salary+ "<br>");
		System.out.println("\n\n\t\t" + new Date());
		System.out.println(this.add(10,25));
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init is called");
		this.id = 25;
		this.name = "puja";
		this.salary = 10000.00;
	}
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	System.out.println("\n\n\t\t This is destory message");
    }
    public int add(int a,int b) {
    	return a+b;
    }
}
