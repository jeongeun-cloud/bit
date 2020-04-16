package org.comstudy21.db_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.comstudy21.util.JdbcUtil;

public class DBInsertEx {
	public static Connection conn = JdbcUtil.getConnection();
	public static PreparedStatement pstmt;
	public static String sql = "INSERT INTO MEMBERS(name, email, phone) VALUES(?,?,?)";
	
	// DAO ����
	public static void insert(String name, String email, String phone) {
//		String name = "test1";
//		String email = "test@shop.com";
//		String phone = "010-5555-5555";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, phone);
			int cnt = pstmt.executeUpdate();
			if(cnt >0) {
				System.out.println("�Է� ����!");
			} else {
				System.out.println("�Է� ����!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	
	// Controller ����
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		String name = scan.next();
		System.out.print("�̸��� �Է� : ");
		String email = scan.next();
		System.out.print("��ȭ��ȣ �Է� : ");
		String phone = scan.next();
		
		insert(name, email, phone);
		
		System.out.println("----- �Է� ���� -----");
		DBSelectEx2.main(null); // ��� 
	}

}
