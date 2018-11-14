package com.training.ui;

import java.io.IOException;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
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
		RequestDispatcher dispatcher = request.getRequestDispatcher("DummyServlet");
		String myName = "puja";
		String myNativePlace = "chandala";
		
		
		request.setAttribute("NAME", myName);
		request.setAttribute("NATIVE", myNativePlace);
		request.setAttribute("TODAY", new Date());
		request.setAttribute("AGE", new Integer(21));
		List<String> cityNames = new ArrayList<>(); 
			
			cityNames.add("Bhimavaram");
			cityNames.add("rajamundry");
			cityNames.add("Hyderabad");
			cityNames.add("Banglore");
			
		request.setAttribute("CITYNAMES", cityNames);
		
		dispatcher.forward(request, response);
	}

}
