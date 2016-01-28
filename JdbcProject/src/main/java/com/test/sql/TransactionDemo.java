package com.test.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.test.dao.DBException;
import com.test.dao.StudentDAO;
import com.test.dao.StudentDTO;

public class TransactionDemo {

	public static void main(String[] args)  throws Exception{
		Connection connection = DBUtil.getDBConnection();
		connection.setAutoCommit(false);
		try{
			PreparedStatement pstmt = connection.prepareStatement("INSERT INTO Student VALUES (?,?,?,?)");
			pstmt.setInt(1, 6666);
			pstmt.setString(2, "Jhon" );
			pstmt.setInt(3,3400);
			pstmt.setString(4, "MS" );
			int result = pstmt.executeUpdate(); // Step1 
			
			 //Step2
			pstmt.setInt(1, 101);
			pstmt.setString(2, "Tim" );
			pstmt.setInt(3,2345);
			pstmt.setString(4, "MS" );
			result = pstmt.executeUpdate();
			connection.commit();
		}catch(Exception ex){
			ex.printStackTrace();
			connection.rollback(); //Undo/Revert
		}
		
	}
}
