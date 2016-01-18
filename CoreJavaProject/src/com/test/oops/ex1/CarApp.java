package com.test.oops.ex1;

public class CarApp {

	public static void main(String[] parms) {
		if(parms[0].equals("Nissan")){
			Nissan nissanObj = new Nissan();
			nissanObj.start();
			nissanObj.move();
			nissanObj.stop();
		}else if(parms[0].equals("Honda")){
			Honda hondaObj = new Honda();
			hondaObj.start();
			hondaObj.move();
			hondaObj.stop();
		}else if(parms[0].equals("Audi")){
			Audi audiObj = new Audi();
			audiObj.start();
			audiObj.move();
			audiObj.stop();
		}else{
			System.out.println("Car type Not Supported!!!");
		}
	}

}
