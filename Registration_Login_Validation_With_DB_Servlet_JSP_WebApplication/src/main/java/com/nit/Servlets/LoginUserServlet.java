package com.nit.Servlets;

import java.io.IOException;

import com.nit.Bean.UserBean;
import com.nit.DAO.LoginDAO;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/LoginUserServlet") 
public class LoginUserServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		UserBean ub = new UserBean();
		
		ub.setUserName(req.getParameter("uname")); 
		ub.setPassword(req.getParameter("pass")); 
		
		LoginDAO ld = new LoginDAO(); 
		
		boolean login = ld.login(ub.getUserName(), ub.getPassword());
	 	
		if (login) {
			req.setAttribute("userName", ub.getUserName());
			req.getRequestDispatcher("loginSuccess.jsp").forward(req, res);
		} else {
			req.getRequestDispatcher("loginError.jsp").forward(req, res);
		}
	}
}
