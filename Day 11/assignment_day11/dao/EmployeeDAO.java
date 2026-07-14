package com.coforge.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.coforge.ems.model.Employee;
import com.coforge.ems.util.ApplicationProperties;
import com.coforge.ems.util.DBUtil;

public class EmployeeDAO {
	public int createEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		int n = 0;
		Connection connection = DBUtil.getDBConnection();
		
		
		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.insertSql);
		statement.setInt(1, employee.getEid());
		statement.setString(2, employee.getEname());
		statement.setInt(3, employee.getEsalary());
		statement.setInt(4, employee.getDno());
		
		n = statement.executeUpdate();
		
		return n;
	}
	public boolean updateEmployeeSalary(int eid, int salary) {

	    try {

	        Connection connection = DBUtil.getDBConnection();

	        String sql = "UPDATE emp SET esalary=? WHERE eid=?";

	        PreparedStatement statement = connection.prepareStatement(sql);

	        statement.setInt(1, salary);
	        statement.setInt(2, eid);

	        int n = statement.executeUpdate();

	        statement.close();
	        connection.close();

	        return n > 0;

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return false;
	}
	public boolean deleteEmployee(int eid) {

	    try {

	        Connection connection = DBUtil.getDBConnection();

	        String sql = "delete from emp where eid=?";

	        PreparedStatement statement = connection.prepareStatement(sql);

	        statement.setInt(1, eid);

	        int n = statement.executeUpdate();

	        statement.close();
	        connection.close();

	        return n > 0;

	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();

	    return false;
	}
}
	public Employee findEmployeeById(int eid) {

	    Employee employee = null;

	    try {

	        Connection connection = DBUtil.getDBConnection();

	        String sql = "select * from emp where eid=?";

	        PreparedStatement statement = connection.prepareStatement(sql);

	        statement.setInt(1, eid);

	        ResultSet rs = statement.executeQuery();

	        if (rs.next()) {

	            employee = new Employee();

	            employee.setEid(rs.getInt("eid"));
	            employee.setEname(rs.getString("ename"));
	            employee.setEsalary(rs.getInt("esalary"));
	            employee.setDno(rs.getInt("dno"));
	        }

	        rs.close();
	        statement.close();
	        connection.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return employee;
	}
	public List<Employee> findAllEmployee() throws ClassNotFoundException, SQLException {
		List<Employee> employeeList = new ArrayList<>();
		
		Connection connection = DBUtil.getDBConnection();
		
		PreparedStatement statement = connection.prepareStatement(ApplicationProperties.findAllSql);
		
		ResultSet resultSet = statement.executeQuery();
		
		while(resultSet.next()) {
			Employee employee = new Employee();
			employee.setEid(resultSet.getInt("eid"));
			employee.setEname(resultSet.getString("ename"));
			employee.setEsalary(resultSet.getInt("esalary"));
			employee.setDno(resultSet.getInt("dno"));
			
			employeeList.add(employee);			
		}
		
		return employeeList;
		
	}
}

