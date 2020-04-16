package org.comstudy21.db_select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.util.JdbcUtil;

public class DBSelectEx2 {
	public static Connection conn = JdbcUtil.getConnection();
	public static Statement stmt = null;
	public static ResultSet rs = null;
	public static String sql = "SELECT * FROM MEMBERS";
	
	public static void setConn(Connection conn) {
		DBSelectEx2.conn = conn;
	}

	// DAO�� ����
	public static ArrayList<Member> selectAll() {
		ArrayList<Member> list = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<Member>();
			while(rs.next()) {
				int no = rs.getInt(1);
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				//System.out.printf("%d | %s | %s | %s \n", no, name, email, phone);
				Member newMem = new Member(no, name, email, phone);
				list.add(newMem);
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
		// �߿�! : ����� �����Ѵ� (return null; �� ������ �ʵ��� ����)
		return list;

	}

	// Controller�� ����
	public static void main(String[] args) {
		ArrayList<Member> list = selectAll();
		for(Member mem : list) {
			System.out.println(mem);
		}
	}
	
}
