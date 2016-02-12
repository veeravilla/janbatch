package com.test.service;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.StudentDAO;
import com.test.dao.pojo.Student;
import com.test.dto.StudentDTO;

@Service
@Transactional
public class StudentService {

	@Autowired
	StudentDAO studentDAO;
	
	@Autowired
	DozerBeanMapper dozermapper;
	
	public StudentDTO getStudent(Integer sno){
		Student student = studentDAO.read(sno);  
		StudentDTO studentDTO = dozermapper.map(student, StudentDTO.class);
		return studentDTO;
	}
}
