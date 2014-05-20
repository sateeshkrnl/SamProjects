package com.emp.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.bean.EmployeeBean;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet(name="TestServlet",urlPatterns={"/TestServlet"})
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
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
		String destinationName = "queue/test";
		try {
			InitialContext ic = new InitialContext();
			ConnectionFactory fac= (ConnectionFactory)ic.lookup("/ConnectionFactory");
			Queue queue = (Queue) ic.lookup(destinationName);
			Connection conn = fac.createConnection();
			Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
			MessageProducer producer = session.createProducer(queue);
			conn.start();
			TextMessage message = session.createTextMessage("hi this is message");
			producer.send(message);
		} catch (NamingException | JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
