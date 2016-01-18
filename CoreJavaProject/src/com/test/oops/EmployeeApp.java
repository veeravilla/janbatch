package com.test.oops;

public class EmployeeApp {

	public static void main(String[] args) {
		
		Employee.count = 100;

		Employee.printEmployeeCount();
		
		
		Employee emp1 = new Employee(999,"Steve",4500f);
		/*emp1.eno = 101;
		emp1.ename = "Jhon";
		emp1.salary =3456.6f;*/
		emp1.printDetails();
		System.out.println(emp1.getEno() + " , " + emp1.getEname() + " , "+ emp1.getSalary());
		emp1.count = 200;
		Employee.printEmployeeCount();
		
		
		Employee emp2 = new Employee(98765);
		//emp2.eno = 9987;
		//emp2.ename = "Tim";
		//emp2.salary =5678.6f;
		emp2.setEno(8909);
		emp2.setEname("Rao");
		emp2.setSalary(3456.7f);
		emp2.printDetails();
		
		
	}

}
