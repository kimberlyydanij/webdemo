package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcTemplate {

	public static Connection getConnection() {
		Connection con=null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username ="hr";
			String password ="a1234";
			
			try {
				con = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // end catch
		
		return con;
		
	} // end getConnection();
	
	public static void close(Connection con) {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} // end close(); con
	
	public static void close(ResultSet rs) {
		if(rs!=null) {
			
			try {
				rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
			
	} // end close rs
	
	public static void close(Statement stmt) {
		if(stmt!=null)
			try {
				stmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
	} // close stmt
	
	public static void close(PreparedStatement pstmt) {
		if(pstmt!=null) {
			
			try {
				pstmt.close();
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
		}
	} // close pstmt
	
	
} // end class
