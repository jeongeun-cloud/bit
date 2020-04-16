package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	public static Connection getConnection() {
		try {
			Class.forName("org.h2.Driver");	
			String url = "jdbc:h2:tcp://localhost/~/test";
			String user = "sa";
			String password = "";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���ؼ� ����");
			e.printStackTrace();
		} 
		return null;
	}
	
	
	// �����ε� (�ٸ� db������ ���)
	public static Connection getConnection(String driver, String url, String user, String password) {
		try {
			Class.forName(driver);	
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���ؼ� ����");
			e.printStackTrace();
		} 
		return null;
	}

}
