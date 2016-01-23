package com.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student(567, "Jhon", 323));
		stuList.add(new Student(45, "Ave", 6452));
		stuList.add(new Student(57, "Tim", 4552));
		stuList.add(new Student(167, "Tao", 1234));
		stuList.add(new Student(7, "Ken", 456));
		
		List<Student> filterList = new ArrayList<Student>();
		
		for(Student student : stuList){
			if(student.getSno() > 50 && student.getFee() < 5000){
				filterList.add(student);
			}
		}

		System.out.println(filterList.size());
	}

}
