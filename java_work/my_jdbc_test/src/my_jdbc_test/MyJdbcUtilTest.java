package my_jdbc_test;

import java.sql.Connection;

import org.comstudy21.util.JdbcUtil;

public class MyJdbcUtilTest {

	public static void main(String[] args) {
		Connection conn = JdbcUtil.getConnection();
		System.out.println(conn);

	}

}
