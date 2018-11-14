package com.training.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Doctor;

/**
 * Servlet implementation class DoctorCreatingServlet
 */
@WebServlet("/DoctorCreatingServlet")
public class DoctorCreatingServlet extends HttpServlet {
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
		Doctor doctor = new Doctor();
		
		doctor.setId(101);
		doctor.setName("puja");
		doctor.setQualification("MBBS");
		doctor.setFees(100.00);
		doctor.setExperience(21);
		doctor.setGender("FEMALE");
		
		
		Doctor doctor1 = new Doctor();
		
		doctor1.setId(102);
		doctor1.setName("jyothi");
		doctor1.setQualification("gynacology");
		doctor1.setFees(500.00);
		doctor1.setExperience(2);
		doctor1.setGender("FEMALE");
	
		
		
		Doctor doctor2 = new Doctor();
		
		doctor2.setId(103);
		doctor2.setName("swathi");
		doctor2.setQualification("Dentist");
		doctor2.setFees(50.00);
		doctor2.setExperience(1);
		doctor2.setGender("FEMALE");
		
		
		
		Doctor doctor3 = new Doctor();
		
		doctor3.setId(104);
		doctor3.setName("kranti");
		doctor3.setQualification("cardiology");
		doctor3.setFees(1000.00);
		doctor3.setExperience(3);
		doctor3.setGender("MALE");
		
		
		Doctor doctor4 = new Doctor();
		
		doctor4.setId(105);
		doctor4.setName("Bhagi");
		doctor4.setQualification("Vetinary");
		doctor4.setFees(100.00);
		doctor4.setExperience(2);
		doctor4.setGender("FEMALE");
		
		
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(doctor);
		doctors.add(doctor1);
		doctors.add(doctor2);
		doctors.add(doctor3);
		doctors.add(doctor4);
		request.setAttribute("DOCTORS", doctors);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Display4.jsp");
		dispatcher.forward(request, response);
	
	
	
	}
	
	

}
