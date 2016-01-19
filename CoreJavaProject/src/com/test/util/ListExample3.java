package com.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.test.oops.Pen;

public class ListExample3 {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student(567, "Jhon", 323));
		stuList.add(new Student(45, "Ave", 6452));
		stuList.add(new Student(57, "Tim", 4552));
		stuList.add(new Student(167, "Tao", 1234));
		stuList.add(new Student(7, "Ken", 456));
		
		Student s1 = new Student(167, "Tao", 1234);
		Student s2 = new Student(167, "Tao", 1234);
		
		System.out.println("Student List " + stuList) ;
		
		if(s1.equals(s2)){ //s1 == s2
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
		
		if(stuList.contains(new Student(167, "Tao", 1234))){
			System.out.println("Element Found");
		}else{
			System.out.println("Not Found");
		}
		
		
	//	Collections.sort(stuList);

	}

}
