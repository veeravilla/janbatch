package com.test.oops.ex3;

public abstract class Car {
	public abstract void start();
	
	public void stop(){
		System.out.println(" Car Stop ()");
	}
	
	public abstract void move();
	
	public void execute(){
		start();
		move();
		stop();
	}
}
