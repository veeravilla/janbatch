package com.test.sql;

import java.sql.CallableStatement;
import java.sql.Connection;

public class CstmtDemo {

	public static void main(String[] args) throws Exception {
		Connection connection = DBUtil.getDBConnection();
		CallableStatement cstmt =  connection.prepareCall("{call saveStudent(?,?,?,?)}");
		cstmt.setInt(1, 5432);
		cstmt.setString(2, "Jhon" );
		cstmt.setString(3,"MS");
		cstmt.setInt(4, 3400 );
		cstmt.executeUpdate();
	}

}
