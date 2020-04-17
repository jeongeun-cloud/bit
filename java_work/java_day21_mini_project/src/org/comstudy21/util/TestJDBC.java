package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

	public static void main(String[] args) {
		try {
			// 1. ����̹� �ҷ����� 
			Class.forName("org.h2.Driver");		// Ŭ���� Ȯ���ڴ� ���ֱ�
			System.out.println("����̹� �˻� ����!");
			
			// 2. Connection ��ü ������
			String url = "jdbc:h2:tcp://localhost/~/test";
			String user = "sa";
			String password = "";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn => " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���ؼ� ����");
			e.printStackTrace();
		} 

	}

}
