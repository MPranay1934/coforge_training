package com.coforge.ems.util;
//consists all the literals(direct hotcoding);
public class ApplicationProperties {
	//Database Connection Properties


		public static final String driver = "com.mysql.cj.jdbc.Driver";
		public static final String url = "jdbc:mysql://localhost:3306/table_employee";
		public static final String username = "root";
		public static final String password = "admin"; 

//Database SQL Queries
		
		public static final String insertSql = "insert into emp values (?, ? ,?, ?)";
		public static final String findAllSql = "select * from emp";
		
//Application response properties
		
		public static final String insertSuccess = "SUCCESS : Employee Record Inserted";
		public static final String Failed = "FAILED : " ;
		
		
		// Application response properties

	

		public static final String updateSuccess = "SUCCESS : Employee Record Updated";

		public static final String deleteSuccess = "SUCCESS : Employee Record Deleted";

		public static final String dbFailed = "FAILED : Database Operation Failed";
		

		
		
		public static final String validationFailed = "FAILED : invalid employee object or details";
		public static final String notFound = "FAILED : Employee Record Not Found";
}
