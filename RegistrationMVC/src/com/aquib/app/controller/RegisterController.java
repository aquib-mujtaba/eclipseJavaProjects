package com.aquib.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aquib.app.Service.RegisterService;
import com.aquib.app.dao.HotDateDao;
import com.aquib.app.dto.RegisterDto;

@WebServlet("/registerServt")
public class RegisterController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RegisterDto registerDto = new RegisterDto();
		registerDto.setFname(req.getParameter("fname"));
		registerDto.setLname(req.getParameter("lname"));
		registerDto.setAddress(req.getParameter("add"));
		registerDto.setPhonenumber(req.getParameter("phone"));
		// create RegisterServicve object
		RegisterService servive = new RegisterService();
		String result = servive.addUser(registerDto);
		RequestDispatcher rsd = null;
		if (result.equals("error")) {
			req.setAttribute("error", "Failed To Insert Data ");
			rsd = req.getRequestDispatcher("Error.jsp");
		} else {
			req.setAttribute("fname", result);
			rsd = req.getRequestDispatcher("sucsses.jsp");
		}
		HotDateDao dao = new HotDateDao();
		dao.getHotDateDetails();
		System.out.println("<<===End===>>");
		rsd.forward(req, resp);
	}
}
