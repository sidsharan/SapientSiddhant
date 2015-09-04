package com.sapient.cui.client;

abstract class Employee {
	abstract void netSalary();
	/*
	 * public void netSalary() { System.out.println("Employee's Salary"); }
	 */
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR recruit = new HR();
		Finance finance = new Finance();
		Employee emp;
		emp = recruit.empType("I"); // upcast
		if (emp != null)
			finance.procesSalary(emp);
		emp = recruit.empType("C");
		if (emp != null)
			finance.procesSalary(emp);
	}

}
