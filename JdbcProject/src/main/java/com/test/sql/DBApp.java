package com.test.sql;

import java.util.List;

import com.test.dao.DBException;
import com.test.dao.StudentDAO;
import com.test.dao.StudentDTO;

public class DBApp {

	public static void main(String[] args)  throws DBException{
		StudentDAO dao = new StudentDAO();
		//boolean result = dao.save(new StudentDTO(888, "Rao", "MS", 4523));
		//boolean result = dao.update(new StudentDTO(999, "Rao", "BS", 6543));
		
	//	boolean result = dao.delete(888);
		/*if(result)
		//	System.out.println(" Deleted Stduent Record.");
			System.out.println(" Added / Updated Stduent Record.");
		else
			System.out.println("Something went worng while saving the record.");*/
			//System.out.println("Record Not  Found");
		
	List<StudentDTO> stuList = dao.getAllStudents(); //dao.getStudent(57678);
	if(stuList !=null)
		System.out.println(stuList);
	else
		System.out.println("Not Found");
	}

}
