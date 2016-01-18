package com.test.examples;

public class SwitchDemo {
    public static void main(String[] args) {

        int month = 2;

       switch(month) {
      
       case 1:
            System.out.println("Jan");
            break;
            
       case 2:
        	 System.out.println("Feb");
        	 break;
        	 
       case 3:
        	 System.out.println("Mar");
        	 break;
       case 4:
        	 System.out.println("Apr");
        	 break;
        	 
       default:
        	 System.out.println("Not A Valid Month");
        }
    }
}
