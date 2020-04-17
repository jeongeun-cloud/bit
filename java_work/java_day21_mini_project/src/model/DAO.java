package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import org.comstudy21.util.JdbcUtil;


public class DAO {
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs = null;
	
	String SQL_SELECT_ALL = "SELECT * FROM MEMBERS";
	String SQL_SELECT = "SELECT *FROM MEMBERS WHERE NO=?";
	String SQL_SELECT2 = "SELECT * FROM MEMBERS WHERE NAME LIKE '%'||?||'%'";
	String SQL_SELECT3 = "SELECT * FROM MEMBERS WHERE NAME LIKE '%'||?||'%' OR EMAIL LIKE '%'||?||'%'";
	String SQL_SELECT4 = "SELECT * FROM MEMBERS WHERE NAME LIKE '%'||?||'%' AND EMAIL LIKE '%'||?||'%' AND PHONE LIKE '%'||?||'%'";
	String SQL_INSERT = "INSERT INTO MEMBERS(NAME,EMAIL,PHONE) VALUES(?,?,?)";
	String SQL_UPDATE = "UPDATE MEMBERS SET NAME=?, EMAIL=?, PHONE=? WHERE NO=?";
	String SQL_DELETE = "DELETE FROM MEMBERS WHERE NO=?";

	public DAO() {}
	

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	
	public Vector<Vector> selectAll() {
		conn = JdbcUtil.getConnection();
		Vector<Vector> vector = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL_SELECT_ALL);
			vector = new Vector<Vector>();
			while(rs.next()) {
				Vector v = new Vector<>();
				v.add(rs.getInt("no"));
				v.add(rs.getString("name"));
				v.add(rs.getString("email"));
				v.add(rs.getString("phone"));
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


	public Vector<Vector> select(int no) {
		conn = JdbcUtil.getConnection();
		Vector<Vector> vector = null;
		try {
			pstmt = conn.prepareStatement(SQL_SELECT);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			
			vector = new Vector<>();
			while(rs.next()) {
				Vector v = new Vector<>();
				v.add(rs.getInt("no"));
			    v.add(rs.getString("name"));
			    v.add(rs.getString("email"));
			    v.add(rs.getString("phone"));
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

	 
	 
	public Vector<Vector> select( String name) {
		conn = JdbcUtil.getConnection();
		Vector<Vector> vector = null;
			
		try {
			pstmt = conn.prepareStatement(SQL_SELECT2);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			vector = new Vector<>();
			
			while(rs.next()) {
				Vector v = new Vector<>();
			    v.add(rs.getInt("no"));
			    v.add(rs.getString("name"));
			    v.add(rs.getString("email"));
			    v.add(rs.getString("phone"));
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
		
		
	public Vector<Vector> select(String name, String email) {
		conn = JdbcUtil.getConnection();
		Vector<Vector> vector = null;
	
		try {
			pstmt = conn.prepareStatement(SQL_SELECT3);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			rs = pstmt.executeQuery();
			vector = new Vector<>();
			
			while(rs.next()) {
			    Vector v = new Vector<>();
			    v.add(rs.getInt("no"));
			    v.add(rs.getString("name"));
			    v.add(rs.getString("email"));
			    v.add(rs.getString("phone"));
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
		 
		 
	public Vector<Vector> select(String name, String email, String phone) {
		conn = JdbcUtil.getConnection();
		Vector<Vector> vector = null;
		
		try {
			pstmt = conn.prepareStatement(SQL_SELECT4);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, phone);
			rs = pstmt.executeQuery();

			vector = new Vector<>();
			
			while(rs.next()) {
			    Vector v = new Vector<>();
			    v.add(rs.getInt("no"));
			    v.add(rs.getString("name"));
			    v.add(rs.getString("email"));
			    v.add(rs.getString("phone"));
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
	
	
	public void insert(Member dto) {
		conn = JdbcUtil.getConnection();
		
		try {
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getPhone());
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
	
	
	public void update(Member dto) {
		conn = JdbcUtil.getConnection();
		
		try {
			pstmt = conn.prepareStatement(SQL_UPDATE);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getPhone());
			pstmt.setInt(4, dto.getNo());
			
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
	
	
	public void delete(Member dto) {
		conn = JdbcUtil.getConnection();
		
		try {
			pstmt = conn.prepareStatement(SQL_DELETE);
			pstmt.setInt(1, dto.getNo());
			int cnt = pstmt.executeUpdate();
			if(cnt > 0) {
				System.out.println("���� ����!");
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
	

}
