package com.test.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample1 {

	public static void main(String[] args) {
		Set<String> strSet = new HashSet<String>();
		strSet.add("Apple");
		strSet.add("Jhon");
		strSet.add("Tim");
		strSet.add("Apple");
		strSet.add("Jhon");
		strSet.add("Tim");
		strSet.add("Ken");
		
		System.out.println(strSet);

	}

}
