package com.aquib;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/sa")
public class RegController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4006151726245440065L;
	int count;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Read Form Data
		String name = req.getParameter("name");
		String add = req.getParameter("add");
		try {
			Connection con = null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "admin");
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?)");
			ps.setString(1, name);
			ps.setString(2, add);
			count = ps.executeUpdate();

		} catch (SQLException e) {
			e.getMessage();
		}
		PrintWriter pw = resp.getWriter();
		if (count == 1) {
			pw.println("===Data Stored In data Base===");
		} else {
			pw.println("---Data Not inserted into Data Base---");
		}
	}
}
