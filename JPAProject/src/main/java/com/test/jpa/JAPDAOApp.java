package com.test.jpa;

import java.util.List;

import com.test.dao.StudentDAO;
import com.test.pojo.Student;

public class JAPDAOApp {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		
		//Insert
		//studentDAO.save(new Student(6888, "BBBB", "MS", 9009));
		
		//Update
		//studentDAO.update(new Student(101, "ABC", "MN", 7777));
		
		//Delete : Not Working
		studentDAO.delete(888);
		
		//Find / Read
		//Student student = studentDAO.findBySno(104);
		/*List<Student> stuList =  studentDAO.getAllStudentsByName("Ti%");//studentDAO.getAllStudentsByFee(7000);
		for(Student stu : stuList){
			System.out.println(" ############# " + stu);
		}*/
		//System.out.println(" student  ########### "+studentDAO.getAllStudents());

	}

}
