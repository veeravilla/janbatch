package com.test.examples;

public class Application1 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Core Java Class !!");
		
		calculateInterest(2000,2,3);
		calculateInterest(2005,212,33);
		calculateInterest(2005,212,33);
		
		int interestAmount = calculateSimpleInterest(5000,3,4);
		
		System.out.println("Total Amoutn " + (interestAmount+ 5000));

	}
	
	public static void calculateInterest(int amount,int months,int rate){
		int interest = (amount*months*rate)/100;
		System.out.println(" Interest " + interest);
	}
	
	
	public static int calculateSimpleInterest(int amount,int months,int rate){
		int interest = (amount*months*rate)/100;
		return interest;
	}
	
}
