package com.test.ser;

public class SingleTon {

	private static SingleTon singleTonRef;
	
	private SingleTon(){ 
		System.out.println(" SingleTon : Object Created");
	}
	
	static{
		singleTonRef = new SingleTon();
	}
	
	public  static SingleTon getInstance(){
		/*if(singleTonRef == null){
			synchronized(singleTonRef) {
				if(singleTonRef == null){
					singleTonRef = new SingleTon();
				}
			}
		}*/
		return singleTonRef;
	}
}
