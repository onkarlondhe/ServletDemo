package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	@Override
	public void init(ServletConfig config) throws ServletException {
 		super.init(config);
 		System.out.println("init method called...");
 		
 		String username= config.getServletContext().getInitParameter("username");
 		System.out.println(username);
		}
	
    public FirstServlet() {
        super();
     }

//	 @Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
// 
//		 PrintWriter out = res.getWriter();
//		 out.println("Inside service method...");
//		 String user = req.getParameter("username");
//		 String pass = req.getParameter("pass");
//		 
//		 out.print("Welcome "+user+",");
//	 }
    
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
 		super.doGet(req, resp);
 		 PrintWriter out = resp.getWriter();
		 out.println("Inside service method...");
		 String user = req.getParameter("username");
		 String pass = req.getParameter("pass");
		 
 		 if(user.equalsIgnoreCase("Onkar")&& pass.equals("1234") ) {
			 out.println("Welcome"+user+",");
		 }else {
		 	out.println("something went wrong..");
		 }
	}
	 
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		 
//		PrintWriter out = resp.getWriter();
//		out.println(" Inside postMethod...");
//		
//		String user = req.getParameter("username");
//		String pass = req.getParameter("pass");
//		out.print("Welcome"+user+",");
//		
//	}
	
	
}
