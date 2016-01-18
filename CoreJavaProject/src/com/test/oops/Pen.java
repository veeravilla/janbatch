package com.test.oops;

public class Pen {

	String color;
	
	public String printStringData() {
		return " Pen [ color : " + color + " ]" ;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void write(){
		System.out.println("  Color   " + color);
	}

	public Pen(String color) {
		this.color = color;
	}
	
	public Pen(){
		//no-op
	}
}
