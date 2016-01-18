package com.test.examples;

import java.io.FileInputStream;

public class ReadFileData {

	public static void main(String[] args)  throws Exception{
		FileInputStream fin = new FileInputStream("C:\\Jan2016\\CoreJavaProject\\src\\com\\test\\examples\\Student.java");
		int data;
		while( (data=fin.read()) != -1){
			System.out.print((char)data);
		}
		fin.close();
	}

}
