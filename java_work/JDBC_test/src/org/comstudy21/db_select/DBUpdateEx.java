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
				System.out.println("수정 완료!");
			} else {
				System.out.println("수정 실패!");
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
		DBSelectEx2.main(null); // 출력 되는 것을 미리 보여줌
		System.out.println("-----------------------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수정 할 no 입력 : ");
		int no = scan.nextInt();
		System.out.print("새 이름 입력 : ");
		String name = scan.next();
		System.out.print("새 이메일 입력 : ");
		String email = scan.next();
		System.out.print("새 전화번호 입력 : ");
		String phone = scan.next();
		
		update(new Member(no, name, email, phone));
		
		DBSelectEx2.setConn(JdbcUtil.getConnection());
		DBSelectEx2.main(null); // 결과 확인 
	}

}
