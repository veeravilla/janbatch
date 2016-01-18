package com.test.oops.ex4;

public class CarAppV2 {

	public static void main(String[] parms) throws Exception {
		Car carRef = null;
		Class classRef = Class.forName(parms[0]);
		Object objectRef = classRef.newInstance(); //Audi();
		carRef = (Car)objectRef; //TypeCasting
		carRef.start();
		carRef.move();
		carRef.stop();
		if(carRef instanceof SportsCar){
			System.out.println(" Sports Car Logic");
		}
	}

}
