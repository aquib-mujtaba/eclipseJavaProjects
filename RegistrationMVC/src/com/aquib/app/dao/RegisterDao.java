package com.aquib.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aquib.app.dto.RegisterDto;

public class RegisterDao {

	public String addUser(RegisterDto dto) {
		PreparedStatement ps = null;
		int count = 0;
		String sql = "insert into user values (?,?,?,?)";
		try {
			Connection con = null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "admin");
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getFname());
			ps.setString(2, dto.getLname());
			ps.setString(3, dto.getPhonenumber());
			ps.setString(4, dto.getAddress());
			count = ps.executeUpdate();

		} catch (SQLException e) {
			e.getMessage();
		}
		if (count == 0) {
			return "error";
		} else {
			return dto.getFname();
		}
	}
}
