package com.test.oops.ex2;

public class CarApp {

	public static void main(String[] parms) {
		Car carRef = null;
		if(parms[0].equals("Nissan")){
			carRef = new Nissan();
		}else if(parms[0].equals("Honda")){
			carRef = new Honda();
		}else if(parms[0].equals("Audi")){
			carRef = new Audi();
		}else{
			System.out.println("Car type Not Supported!!!");
			System.exit(0);
		}
		carRef.start();
		carRef.move();
		carRef.stop();
	}

}
