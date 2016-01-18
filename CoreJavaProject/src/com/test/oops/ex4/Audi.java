package com.test.oops.ex4;
public class Audi  implements Car,SportsCar{

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
