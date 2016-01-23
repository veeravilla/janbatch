package com.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.PredicateUtils;
import org.apache.commons.collections.functors.EqualPredicate;

public class FilterDemoWithAPI {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student(567, "Jhon", 323));
		stuList.add(new Student(45, "Ave", 6452));
		stuList.add(new Student(57, "Tim", 4552));
		stuList.add(new Student(167, "Tao", 1234));
		stuList.add(new Student(7, "Ken", 456));
		
		stuList.add(new Student(567, "Jhon", 323));
		stuList.add(new Student(45, "Ave", 6452));
		stuList.add(new Student(57, "Tim", 4552));
		stuList.add(new Student(167, "Tao", 1234));
		stuList.add(new Student(7, "Ken", 456));
		
		Student student = (Student)CollectionUtils.find(stuList, buildPredicate("sno",45));
		
		List<Student> studentList = (List<Student>)CollectionUtils.select(stuList, buildPredicate("sno",45));
		
		System.out.println(studentList);
	}

	private static BeanPredicate buildPredicate(String propertyName,Object value) {
		EqualPredicate predicateValue = new EqualPredicate(value);
		BeanPredicate beanPredicate = new BeanPredicate(propertyName, predicateValue);
		return beanPredicate;
	}

}
