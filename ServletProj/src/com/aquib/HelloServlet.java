package com.aquib;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(value = "/h")
public class HelloServlet extends GenericServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("its call only one at the life cycle");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("it called n-number of times");
		// get the ui data from HTML page
		String name = req.getParameter("name");
		// it is used to display information in ui or page
		// same as system.out.println
		PrintWriter pw = resp.getWriter();
		pw.println("=====Hi welcome======" + name);
	}

	@Override
	public void destroy() {
		System.out.println("its call only one at the life cycle");

	}

}
