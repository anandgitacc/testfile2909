package org.employee;

public class Employee {
	
	//method 1
	public static void empName() {
		System.out.println("Employee name is Anand");
	}
	
	//method 2
	public static void empMobno() {
		System.out.println("Employee mobile no is 8667070832");
	}
	
	private void empAdd() {
		System.out.println("Employee Add is Chennai");
	}
	
	private void empSalary() {
		System.out.println("Employee salary is $12000");
	}
	
	// main method
	public static void main(String[] args) {
		
		// object creation
		Employee a = new Employee();
		
		// calling methods
		a.empName();
		a.empMobno();
		a.empAdd();
		a.empSalary();
	}
}
