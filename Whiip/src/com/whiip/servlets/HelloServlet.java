package com.whiip.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name="HelloServlet", urlPatterns="/hello")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = -8956375939224740017L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("pages/hello.jsp").forward(req, resp);
		
		
	}

}
