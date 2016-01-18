package com.test.oops.ex3;

public class Audi  extends Car{

		public void start(){
			System.out.println(" Audi Start ()");
		}

		@Override
		public void move() {
			System.out.println(" Audi Move ()");
		}
		
		@Override
		public void stop() {
			System.out.println(" Audi Stop ()");
		}
		
}
