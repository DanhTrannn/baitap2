package com.baitap2.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baitap2.model.User;
public class EmailListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
	        doPost(req, resp);
	    }

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	    	String url = "/index.jsp";
	        String action = request.getParameter("action");
	        if (action == null) action = "join";

	        if (action.equals("join")) {
	            url = "/index.jsp";
	        } else if (action.equals("add")) {
	            String email = request.getParameter("email");
	            String firstName = request.getParameter("firstName");
	            String lastName = request.getParameter("lastName");
	            User user = new User(email, firstName, lastName);
	            request.setAttribute("user", user);
	            url = "/thank.jsp";
	        }
	        getServletContext()
	            .getRequestDispatcher(url)
	            .forward(request, response);
	    }
}