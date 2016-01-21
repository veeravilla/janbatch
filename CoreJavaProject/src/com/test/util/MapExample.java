package com.test.util;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<String, String>();
		map.put("101", "Rama");
		map.put("102", "Malli");
		map.put("101", "Jhon");
		map.put("103", "Tim");
		
		System.out.println(" Map Size " + map.size());
		
		System.out.println(" 103 Value " + map.get("103"));
		
		Set<String> set = map.keySet();
		for(String key : set){
			System.out.println(map.get(key));
		}
		

	}

}
