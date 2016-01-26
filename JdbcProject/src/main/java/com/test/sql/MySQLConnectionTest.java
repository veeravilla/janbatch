package com.test.sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {

	public static void main(String[] args) throws Exception {
		//Load Driver Class Name
		//Class.forName("com.mysql.jdbc.Driver");
		
		//Connection
		Connection connection = DBUtil.getDBConnection();//DriverManager.getConnection("jdbc:mysql://localhost:3306/jandb", "root", "root");
		Connection connection1 = DBUtil.getDBConnection();
		//PErform DB
		System.out.println(connection);
		System.out.println(connection1);
		
		//Close DB
		connection.close();
	}

}
