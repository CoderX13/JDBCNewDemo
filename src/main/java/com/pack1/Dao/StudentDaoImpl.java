package com.pack1.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pack1.model.Student;

public class StudentDaoImpl implements StudentDao {

	Connection conn = null;

	String url = "jdbc:mysql://localhost:3306/studentManage";
	String username = "root";
	String password = "Mohit@2000";
	String driver = "com.mysql.jdbc.Driver";
	int m;

	public int insertIntoDb(Student std) {

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = conn.prepareStatement("insert into studenttable values(?,?,?)");
			ps.setInt(1, std.getId());
			ps.setString(2, std.getName());
			ps.setString(3, std.getCity());

			m = ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Statement stmt=conn.createStatement();

		return m;
	}

}
