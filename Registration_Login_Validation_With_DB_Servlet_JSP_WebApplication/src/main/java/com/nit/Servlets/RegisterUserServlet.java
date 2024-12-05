package com.nit.Servlets;
import java.io.IOException;
import java.io.PrintWriter;

import com.nit.Bean.UserBean;
import com.nit.DAO.UserDAO;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends GenericServlet {

	 
	private static final long serialVersionUID = 8582067491801194094L;

	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		
		UserBean bean = new UserBean();
		
		bean.setUserName(req.getParameter("uname"));
		bean.setPassword(req.getParameter("pass"));
		bean.setAddress(req.getParameter("address"));
		bean.setMailId(req.getParameter("mid"));
		bean.setPhNo(req.getParameter("pno"));
		bean.setState(req.getParameter("state"));
		bean.setCountry(req.getParameter("country"));
		
		//PrintWriter pw = res.getWriter();
		
		RequestDispatcher rd = null;
		UserDAO ud = new UserDAO(); 
		int k = ud.rerister(bean);
		 
		if(k>0) {
			rd =  req.getRequestDispatcher("regSuccess.jsp");
			rd.forward(req, res);
		}else {
			 
			 rd =  req.getRequestDispatcher("regFail.jsp");
			 rd.forward(req, res);
		}
		
		
		
		
		
	}
}
