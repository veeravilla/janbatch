package com.test.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerApp {

	public static void main(String[] args) throws Exception {
		FileInputStream inputStream = new FileInputStream("light.ser");
		ObjectInputStream objstream =  new ObjectInputStream(inputStream);
		Light light = (Light)objstream.readObject();
		light.printStatus();
		inputStream.close();
		

	}

}
