package com.test.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import com.test.dao.DBException;
import com.test.dao.StudentDAO;
import com.test.dao.StudentDTO;

public class BatchDemo {

	public static void main(String[] args)  throws Exception{
		Connection connection = DBUtil.getDBConnection();
		connection.setAutoCommit(false);
		try{
			Statement stmt = connection.createStatement();
			stmt.addBatch("INSERT INTO Student VALUES (9999,'Steve',345,'MS')");
			stmt.addBatch("INSERT INTO Student VALUES (888,'Zhon',8765,'MS')");
			stmt.addBatch("INSERT INTO Student VALUES (4567,'Tim',9087,'MS')");
			stmt.executeBatch();
			connection.commit();
		}catch(Exception ex){
			ex.printStackTrace();
			connection.rollback(); //Undo/Revert
		}
		
	}
}
