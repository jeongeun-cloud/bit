package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

	public static void main(String[] args) {
		try {
			// 1. 드라이버 불러오기 
			Class.forName("org.h2.Driver");		// 클래스 확장자는 빼주기
			System.out.println("드라이버 검색 성공!");
			
			// 2. Connection 객체 얻어오기
			String url = "jdbc:h2:tcp://localhost/~/test";
			String user = "sa";
			String password = "";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn => " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 컨넥션 실패");
			e.printStackTrace();
		} 

	}

}
