package com.test.oops.ex4;

public class Honda implements Car {

	@Override
	public void start() {
		System.out.println(" Honda Start()");
	}

	@Override
	public void move() {
		System.out.println(" Honda Move()");
	}

	@Override
	public void stop() {
		System.out.println(" Honda Stop()");
	}
		
}
