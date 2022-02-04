package com.madhu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCurdOperations 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// Load the Driver
		Class.forName("com.mysql.jdbc.Driver");
		// Create Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/madhudb","root","");
		// Create Statement
		Statement stmt = con.createStatement();
		// Execute the Queries
		/*String sql = "create table student(id int, name varchar(20), salary varchar(20))";
		String sql = "insert into student values(101,'madhu',45000)";
		String sql = "update student set salary = 75000 where id = 101";
		String sql = "delete from student where id = 101";
		stmt.executeUpdate(sql);*/
		// Retrieve the records from the database
		
		ResultSet rs = stmt.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
		}
		
		// Close the connection
		con.close();
		System.out.println("Retrieved successfully");
	}
}
