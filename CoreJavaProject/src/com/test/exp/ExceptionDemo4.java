package com.test.exp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import com.test.util.Student;

public class ExceptionDemo4 {

	public static void main(String[] args)  throws Exception{
		System.out.println(" Start ###############");
		//try{
			//Step0
			FileInputStream fileInputStream= new FileInputStream("Ram.txt");
			fileInputStream.read();
			
			//Step1
			Class.forName("test");
		
	  /*}catch(IOException | ClassNotFoundException exp){
			exp.printStackTrace();
			System.out.println(" Back up Logic .... AExp");
		}*/
	
		
		System.out.println(" End ###############");
	}

}
