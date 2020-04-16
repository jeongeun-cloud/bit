package org.comstudy21.db_select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.comstudy21.util.JdbcUtil;

public class DBSelectEx {

	public static void main(String[] args) {
		Connection conn = JdbcUtil.getConnection();
		// statement : 서술하다
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MEMBERS";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				System.out.printf("%d | %s | %s | %s \n", no, name, email, phone);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();	
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
