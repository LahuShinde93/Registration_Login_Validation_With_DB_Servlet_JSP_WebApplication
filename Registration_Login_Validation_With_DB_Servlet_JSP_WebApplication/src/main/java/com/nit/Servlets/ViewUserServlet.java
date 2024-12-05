package com.nit.Servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.nit.DAO.ViewUsersDAO;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ViewUserServlet")
public class ViewUserServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ViewUsersDAO ud = new ViewUsersDAO();
		ArrayList al = ud.viewUsers();
		
		req.setAttribute("alis", al);
		
		RequestDispatcher rd = req.getRequestDispatcher("viewSuccess.jsp");
		rd.forward(req, res);
		
		
	}

}
