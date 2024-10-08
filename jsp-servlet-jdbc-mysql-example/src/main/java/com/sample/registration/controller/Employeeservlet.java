package com.sample.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.registration.dao.Employeedao;
import com.sample.registration.model.Employee;

/**
 * Servlet implementation class Employeeservlet
 */
@WebServlet("/register")
public class Employeeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private Employeedao employeedao;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employeeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String EMPLOYEESTARTNAME = request.getParameter("EMPLOYEESTARTNAME");
		
		 String EMPLOYEELASTNAME= request.getParameter("EMPLOYEELASTNAME");
		 String EMPLOYEEUSERNAME= request.getParameter("EMPLOYEEUSERNAME");
	 String EMPLOYEEPASSWORD= request.getParameter("EMPLOYEEPASSWORD");
		 String EMPLOYEEADDRESS= request.getParameter("EMPLOYEEADDRESS");
	String EMPLOYEECONTACT= request.getParameter("EMPLOYEECONTACT");
	Employee emp = new Employee();
	emp.setEMPLOYEESTARTNAME(EMPLOYEESTARTNAME);
	emp.setEMPLOYEELASTNAME(EMPLOYEELASTNAME);
	emp.setEMPLOYEEUSERNAME(EMPLOYEEUSERNAME);
	emp.setEMPLOYEEPASSWORD(EMPLOYEEPASSWORD);
	emp.setEMPLOYEEADDRESS(EMPLOYEEADDRESS);
	emp.setEMPLOYEECONTACT(EMPLOYEECONTACT);
	  try {
		  employeedao.registerEmployee(emp);
		  
      } catch (Exception e) {
        
      }

	  RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/emplyoeeeanswer.jsp");
		dispatcher.forward(request, response);
  }
	}


