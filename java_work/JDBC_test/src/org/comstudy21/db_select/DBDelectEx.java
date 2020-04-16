package org.comstudy21.db_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.comstudy21.util.JdbcUtil;

public class DBDelectEx {
	public static Connection conn = JdbcUtil.getConnection();
	public static PreparedStatement pstmt;
	public static String sql = "DELETE FROM MEMBERS WHERE no=?";
	
	public static void delete(int no) {

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			int cnt = pstmt.executeUpdate();
			if(cnt > 0) {
				System.out.println("삭제 성공!");
			} else { 
				System.out.println("삭제 실패!");
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
	
	public static void main(String[] args) {
		DBSelectEx2.main(null);
		System.out.println("------------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제 할 no입력 : ");
		int no = scan.nextInt();

		delete(no);
		DBSelectEx2.setConn(JdbcUtil.getConnection());
		DBSelectEx2.main(null);
		
	}

}
