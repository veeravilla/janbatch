package com.test.exp;

import com.test.util.Student;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		//Step1
		String names[]={"Jhon","Rama","Siva"}; //Excepting from Back End
		System.out.println("Names [4] " + names[4]);
		
		//Step2
		Student studentObj = new Student(101, "Jhon", 2300); //NA
		System.out.println("Sno " + studentObj.getSno());
		
		
		//Step3
		int result = 10/5;
		System.out.println(" Result " + result);

	}

}
