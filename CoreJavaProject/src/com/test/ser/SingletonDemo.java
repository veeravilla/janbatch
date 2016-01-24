package com.test.ser;

public class SingletonDemo {

	public static void main(String[] args) {
		SingleTon sObj = SingleTon.getInstance();
		SingleTon sObj1 = SingleTon.getInstance();
		SingleTon sObj2 = SingleTon.getInstance();

	}

}
