package com.test.oops;

public class Employee {
	//Instance Variables
	private int eno;
	String ename;
	private float  salary;
	
	static int count; // Class Level Variable
	
	public static void printEmployeeCount(){ //Class Level Method
		System.out.println(" Emp count  " + count);
	}
	
	//Instance Methods
	public void setEno(int eno){
		System.out.println(" Previous Value : " + this.eno  + "Current Value" + eno);
		this.eno=eno;
	}
	
	public void setEname(String ename){
		System.out.println(" Previous Value : " + this.ename  + "Current Value" + ename);
		this.ename=ename;
	}
	
	public void setSalary(float salary){
		System.out.println(" Previous Value : " + this.salary  + "Current Value" + salary);
		this.salary=salary;
	}
	
	public int getEno(){
		return eno;
	}
	
	public String getEname(){
		return ename;
	}
	
	public float getSalary(){
		return salary;
	}
	
	public Employee(int eno){
		this.eno = eno;
		System.out.println(" Emp Constructor ... Eno "+ eno);
	}
	
	public Employee(int eno,String ename,float salary){
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		System.out.println(" Emp Constructor ... Eno , Ename , Salary "+ eno+","+ename+","+salary);
	}
	
	public void printDetails(){
		System.out.println(" Eno   ===== " + eno);
		System.out.println(" Ename ===== " + ename);
		System.out.println(" Salary ===== " + salary);
		System.out.println(" Fed Tax ==== " + (salary*0.3));
	}
}
