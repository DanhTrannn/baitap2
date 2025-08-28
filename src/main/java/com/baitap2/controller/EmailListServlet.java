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

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
		// Lấy dữ liệu từ form
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String birth = request.getParameter("birth");
        String heardFrom = request.getParameter("heardFrom");
        String wantsUpdates = request.getParameter("wantsUpdates") != null ? "Yes" : "No";
        String emailOK = request.getParameter("emailOK") != null ? "Yes" : "No";
        String contactVia = request.getParameter("contactVia");

        // Gửi dữ liệu tới JSP qua request attribute
        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        request.setAttribute("email", email);
        request.setAttribute("birth", birth);
        request.setAttribute("heardFrom", heardFrom);
        request.setAttribute("wantsUpdates", wantsUpdates);
        request.setAttribute("emailOK", emailOK);
        request.setAttribute("contactVia", contactVia);

        // Chuyển hướng tới trang cảm ơn
        RequestDispatcher dispatcher = request.getRequestDispatcher("thank.jsp");
        dispatcher.forward(request, response);
    }
}