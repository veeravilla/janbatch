package com.test.util;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {
		Set<Student> stuSet = new TreeSet<Student>(new NameSort());
		stuSet.add(new Student(567, "Jhon", 323));
		stuSet.add(new Student(45, "Ave", 6452));
		stuSet.add(new Student(57, "Tim", 4552));
		stuSet.add(new Student(167, "Tao", 1234));
		stuSet.add(new Student(7, "Ken", 456));

		
		stuSet.add(new Student(567, "Jhon", 323));
		stuSet.add(new Student(45, "Ave", 6452));
		stuSet.add(new Student(57, "Tim", 4552));
		stuSet.add(new Student(167, "Tao", 1234));
		stuSet.add(new Student(7, "Ken", 456));
		
		System.out.println("Size  " + stuSet.size());
		System.out.println(stuSet);

	}

}
