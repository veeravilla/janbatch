package com.test.oops;


public class PenApp {

	public static void main(String[] args) {
		
		Pen p1 = new Pen();
	//	p1.setColor("Red");
		p1.color="Red";
		p1.write();
		System.out.println(p1.printStringData());
		System.out.println(p1); // p1.toString()

		Pen p2 = new Pen("Green");
		//p2.color="Green";
		p2.write();
		System.out.println(p2); //p2.toString()
		System.out.println(p2.printStringData()); 

	}

}
