package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;

import controller.LoginController;
import util.JDBCUtil;

public class DAO {
	public static Connection conn;
	public static Statement stmt;
	public static PreparedStatement pstmt;
	public static ResultSet rs = null;
	public static String id ="";
	public static String pw ="";
	public static String code ="";
	
	public static void setConn(Connection conn) {
		DAO.conn = conn;
	}
	
	public void login(Employee dto) {
		conn = JDBCUtil.getConnection();

		if( dto.getId().equals("") ||  dto.getPw().equals("")) {
			int res = JOptionPane.showConfirmDialog(null, "�ذ��� \n ID�� PW�� �Է��ϼ���!", "���޼���", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
			return;
		}

		String sql = "SELECT * FROM EMPLOYEE WHERE uid='" + dto.getId() + "' AND pwd='" + dto.getPw() + "'";
		//String sql = "SELECT * FROM EMPLOYEE";
		//System.out.println(sql);
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
						
			while(rs.next()) {
				id = rs.getString("uid");
				pw = rs.getString("pwd");
				code = rs.getString("code");
				//System.out.println(id + " " + pw);

			}
			
			if(id.equals(dto.getId())) {
				if(pw.equals(dto.getPw())) {
					int res = JOptionPane.showConfirmDialog(null, "�α��� �Ǿ����ϴ�!", "�α���", 
							JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
					//System.out.println("�α��� ����!");
					new LoginController(id);
				}
				
			} else {
				int res = JOptionPane.showConfirmDialog(null, "�ذ��� \n ID�� PW�� Ȯ�����ּ���!", "�α���", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
				//System.out.println("���̵�� ��й�ȣ�� Ȯ�����ּ���!");
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

	public void idCheck(Employee dto) {
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM EMPLOYEE WHERE uid=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			rs = pstmt.executeQuery();
			
			if(dto.getId().equals("")) {
				int res = JOptionPane.showConfirmDialog(null, "���̵� �Է��ϼ���!", "���޼���", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
				return;
			}
			
			
			if(rs.isBeforeFirst() == true) {
				int res = JOptionPane.showConfirmDialog(null, "�ߺ��Ǵ� ID�Դϴ�", "���޼���", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
				//System.out.println("���̵� �ߺ��ȴ� ");
			} else {
				int res = JOptionPane.showConfirmDialog(null, "��� ������ ID�Դϴ�", "�޼���", 
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
				//System.out.println("��� ����");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		
	}
	

	public void signup(Employee dto) {

		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO EMPLOYEE(UID,PWD,NAME,EMAIL,BIRTH,SEX,CODE) VALUES(?,?,?,?,?,?,?)";
		
		String id = dto.getId();
		String pw = dto.getPw();
		String name = dto.getName();
		String email = dto.getEmail();
		
		String birth = "";
		System.out.println(dto.getBirth());
		System.out.println(dto.getSex());
		System.out.println(dto.getCode());
		
		
		if(dto.getBirth().equals("")) {
			birth = null;
		} else {
			birth = dto.getBirth();
		}
		
		String sex = dto.getSex();
		if(dto.getSex().equals("")) {
			sex = null;
		} else {
			sex = dto.getSex();
		}
		
		String code = dto.getCode();
		if(dto.getCode().equals("")) {
			code = null;
		} else {
			code = dto.getCode();
		}

		if(id.equals("") || pw.equals("") || name.equals("") || email.equals("")) {
			int res = JOptionPane.showConfirmDialog(null, "*ǥ�ô� �ʼ� �Է� �����Դϴ�", 
					"��� �޼���", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
			
		} else {
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				pstmt.setString(2, pw);
				pstmt.setString(3, name);
				pstmt.setString(4, email);
				pstmt.setString(5, birth);
				pstmt.setString(6, sex);
				pstmt.setString(7, code);
				
				int cnt = pstmt.executeUpdate();
				if(cnt > 0) {
					//System.out.println("�Է� ����!");
					int res = JOptionPane.showConfirmDialog(null, "ȸ�� ������ ���������� �Ϸ� �Ǿ����ϴ�! �α��� ���ּ���.", 
							"�޼���", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
					
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
	}

	public Vector<Vector> selectAll() {
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM ACCOUNT";
		Vector<Vector> vector = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			vector = new Vector<Vector>();
			while(rs.next()) {
				Vector v = new Vector<>();
				v.add(rs.getString("num"));
				v.add(rs.getString("salseDate"));
				v.add(rs.getString("customer"));
				v.add(rs.getString("product"));
				v.add(rs.getString("salse"));
				v.add(rs.getInt("quantity"));
				v.add(rs.getInt("price"));
				v.add(rs.getInt("total"));
				v.add(rs.getString("date"));
				v.add(rs.getString("uid"));
				vector.add(v);
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
		
		return vector;
	}

	
	public void input(Account dto) {		
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO ACCOUNT(SALSEDATE, CUSTOMER, PRODUCT, SALSE, QUANTITY, PRICE, TOTAL, DATE, UID) "
				+ "VALUES(?,?,?,?,?,?,?,systimestamp,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSalseDate());
			pstmt.setString(2, dto.getCustomer());
			pstmt.setString(3, dto.getProduct());
			pstmt.setString(4, dto.getSalse());
			pstmt.setInt(5, dto.getQuantity());
			pstmt.setInt(6, dto.getPrice());
			pstmt.setInt(7, (dto.getQuantity() * dto.getPrice()));
			pstmt.setString(8, "admin");
			int cnt = pstmt.executeUpdate();
			if(cnt > 0) {
				int res = JOptionPane.showConfirmDialog(null, "�Է� �Ϸ�.", 
						"�޼���", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
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

	
	public void delete(Account dto) {
		conn = JDBCUtil.getConnection();
		String sql = "DELETE FROM ACCOUNT WHERE NUM=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getNo());
			int cnt = pstmt.executeUpdate();
			if(cnt > 0) {
				int res = JOptionPane.showConfirmDialog(null, "���� �Ϸ�", 
						"�޼���", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
			} else { 
				System.out.println("���� ����!");
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
	

	public void update(Account dto) {
		conn = JDBCUtil.getConnection();
		String sql = "UPDATE ACCOUNT SET SALSEDATE=?, CUSTOMER=?, PRODUCT=?, SALSE=?, QUANTITY=?, PRICE=?, TOTAL=?, DATE=systimestamp WHERE NUM=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSalseDate());
			pstmt.setString(2, dto.getCustomer());
			pstmt.setString(3, dto.getProduct());
			pstmt.setString(4, dto.getSalse());
			pstmt.setInt(5, dto.getQuantity());
			pstmt.setInt(6, dto.getPrice());
			pstmt.setInt(7, (dto.getQuantity() * dto.getPrice()));		
			pstmt.setInt(8, dto.getNo());
			
			int cnt = pstmt.executeUpdate();
			if(cnt > 0) {
				int res = JOptionPane.showConfirmDialog(null, "���� �Ϸ�", 
						"�޼���", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
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

	public Vector<Vector> search(String searchTitle, String word) {
		conn = JDBCUtil.getConnection();
		Vector<Vector> vector = null;
		String sql = "SELECT * FROM ACCOUNT WHERE " + searchTitle + "=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, word);
			rs = pstmt.executeQuery();
			vector = new Vector<>();
			
			while(rs.next()) {
				Vector v = new Vector<>();
				v.add(rs.getString("num"));
				v.add(rs.getString("salseDate"));
				v.add(rs.getString("customer"));
				v.add(rs.getString("product"));
				v.add(rs.getString("salse"));
				v.add(rs.getInt("quantity"));
				v.add(rs.getInt("price"));
				v.add(rs.getInt("total"));
				v.add(rs.getString("date"));
				v.add(rs.getString("uid"));
			    vector.add(v);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
		    e.printStackTrace();
			}
	  }

	  return vector;
	}
	
	


}
