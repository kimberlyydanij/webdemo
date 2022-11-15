package servletdemo.part04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.SessionTemplate;

import static common.jdbcTemplate.*;

public class EmployeesDAO {
	
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public EmployeesDAO() {

	}
	
	private static EmployeesDAO dao = new EmployeesDAO();
	
	public static EmployeesDAO getInstance() {
		
		return dao;
	} // end getInstance
	
	public List<EmployeesDTO> listAll() {
		List<EmployeesDTO> aList = new ArrayList<EmployeesDTO>();
		con = getConnection();
		
		try {
			stmt = con.createStatement();
			String sql = "SELECT * FROM employees ORDER BY employee_id";
			rs=stmt.executeQuery(sql);
			
		while(rs.next() ) {
			EmployeesDTO dto = new EmployeesDTO();
			dto.setEmployee_id(rs.getInt("employee_id"));
			dto.setFirst_name(rs.getString("first_name"));
			dto.setSalary(rs.getInt("salary"));
			aList.add(dto);
			} // end while
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);
		}
		return aList;
	} // end listAll();
	
	//mybatis
	public List<EmployeesDTO> myList() {
		SqlSession session=null;
		session = SessionTemplate.getSqlSession();
		
		return session.selectList("emp.list");
	} //end myList()


} // end class
