package com.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample2 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("Apple");
		strList.add("Jhon");
		strList.add("Tim");
		strList.add("Apple");
		strList.add("Jhon");
		strList.add("Tim");
		strList.add("Ken");
		
		System.out.println("Before Sort List Data " + strList);
		
		if(strList.contains("Jhon")){
			System.out.println("Element Found !!");
		}
		
		List<String> searchList = new ArrayList<String>();
		searchList.add("Tim");
		searchList.add("Jhon");
		searchList.add("Ken");
		
		if(strList.containsAll(searchList)){
			System.out.println("Elements Found !!");
		}
		
		Collections.sort(strList);
		
		System.out.println("After Sort List Data " + strList);
		
	}

}
