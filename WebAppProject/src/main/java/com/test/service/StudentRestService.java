package com.test.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.jaxb.Student;

@Controller
public class StudentRestService {

	@RequestMapping(method=RequestMethod.GET,value="/student/{sno}")
	public @ResponseBody Student getStudent(@PathVariable Integer sno){
		//TODO: JDBC / Hibernate
		Student student = new Student(sno,"Rama","MS",7800);
		return student;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/student")
	public @ResponseBody Student saveStudent(@RequestBody Student student){
		//TODO: JDBC / Hibernate
		
		return student;
	}
}
