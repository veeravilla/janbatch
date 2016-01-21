package com.test.util;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		Map<Course, Student> map = new HashMap<Course, Student>();//new Hashtable<Course, Student>();
		map.put(null, new Student(101, "Jhon",2423));
		map.put(new Course("MD", "Science"), new Student(456, "Steve",556));
		map.put(new Course("MA", "Computer arts"), null);
		
		Student student = map.get(null);
		System.out.println(student);
	}

}
