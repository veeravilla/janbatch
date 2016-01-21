package com.test.util;

import java.io.FileInputStream;
import java.util.Properties;

public class MapExample3 {

	public static void main(String[] args)  throws Exception{
		Properties properties = new Properties();
		String envName = System.getProperty("app.env.name");
		if(envName != null){
			properties.load(MapExample3.class.getResourceAsStream(envName+"-database.properties"));
			System.out.println(properties);
			System.out.println(properties.get("username"));
		}else{
			System.err.println(" Environment is Missing");
			System.exit(-345);
		}
		//properties.load(new FileInputStream("C:\\Users\\Veeru\\git\\janbatch\\CoreJavaProject\\src\\com\\test\\util\\database.properties"));
		
	}

}
