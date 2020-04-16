package org.comstudy21.db_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.comstudy21.util.JdbcUtil;

public class DBUpdateEx {
	public static Connection conn = JdbcUtil.getConnection();
	public static PreparedStatement pstmt;
	public static String sql = "UPDATE MEMBERS SET name=?, email=?, phone=? WHERE no=?";
	
	public static void update (Member member) {
//		String name = "NewName";
//		String email = "New@shop.com";
//		String phone = "010-0000-0000";
//		int no = 2;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getEmail());
			pstmt.setString(3, member.getPhone());
			pstmt.setInt(4, member.getNo());
			
			int cnt = pstmt.executeUpdate();
			if(cnt > 0) {
				System.out.println("���� �Ϸ�!");
			} else {
				System.out.println("���� ����!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	public static void main(String[] args) {
		DBSelectEx2.main(null); // ��� �Ǵ� ���� �̸� ������
		System.out.println("-----------------------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �� no �Է� : ");
		int no = scan.nextInt();
		System.out.print("�� �̸� �Է� : ");
		String name = scan.next();
		System.out.print("�� �̸��� �Է� : ");
		String email = scan.next();
		System.out.print("�� ��ȭ��ȣ �Է� : ");
		String phone = scan.next();
		
		update(new Member(no, name, email, phone));
		
		DBSelectEx2.setConn(JdbcUtil.getConnection());
		DBSelectEx2.main(null); // ��� Ȯ�� 
	}

}
