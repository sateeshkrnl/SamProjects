package com.emp.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

import com.emp.bean.EmployeeBean;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet(name="TestServlet",urlPatterns={"/TestServlet"})
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@WebServiceRef(wsdlLocation="WEB-INF/wsdl/EmployeeBean.wsdl")
	private EmployeeBean employeeBean;
    /**
     * Default constructor. 
     */
    public TestServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.print("HI in Servlet");
		pw.print(employeeBean.getEmployee("12"));
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
