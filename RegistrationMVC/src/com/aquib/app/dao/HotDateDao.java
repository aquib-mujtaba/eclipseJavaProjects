package com.aquib.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aquib.app.dto.HotDateBean;

public class HotDateDao {
	public void getHotDateDetails() {
		int hotDateId;
		String hotelId;
		String fromDate;
		String toDate;
		String description;
		String status;
		List<HotDateBean> hotDateDetailsList = new ArrayList<HotDateBean>();

		String sql = "SELECT * FROM world.hot_date_info;";
		try {
			Connection con = null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "admin");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			// ResultSetMetaData rsmd = rs.getMetaData();
			// System.out.println(rsmd.getColumnCount());

			while (rs.next()) {

				hotDateId = rs.getInt(1);
				hotelId = rs.getString(2);
				fromDate = rs.getString(3);
				toDate = rs.getString(4);
				description = rs.getString(5);
				status = rs.getString(6);

				HotDateBean bean = new HotDateBean(hotDateId, hotelId, fromDate, toDate, description, status);

				hotDateDetailsList.add(bean);
			}
			for (HotDateBean hotDateBean : hotDateDetailsList) {
				System.out.println(hotDateBean.getFromDate());
				System.out.println(hotDateBean.getToDate());
				System.out.println(hotDateBean.getDescription());
			}
		} catch (SQLException e) {
			e.getMessage();
		}
	}
}
