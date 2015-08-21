package com.poly;


abstract class Employee {
	 abstract void netSalary();
	/*public void netSalary() {
		System.out.println("Employee's Salary");
	}
	*/
}

class Intern extends Employee {
	public void netSalary() {
		System.out.println("Intern's Stipend");
	}
	
	public void reimbursement() {
		System.out.println("Reimbursement");
		
	}
}

class Confirmed extends Employee {
	public void netSalary() {
		System.out.println("Confirmed Employee's Salary");
	}
	
	public void transport()
	{
		System.out.println("Transport Facility for Confirmed Employee");
	}
}

class HR {
	public Employee empType(String emp) {
		if (emp.equals("I"))
			return new Intern();
		else if (emp.equals("C"))
			return new Confirmed();
		return null;
	}
}
class Finance{
	public void procesSalary(Employee e)
	{
		e.netSalary();
		if(e instanceof Confirmed)
		{
			Confirmed conf=(Confirmed) e;
			conf.transport();
		}
		if(e instanceof Intern)
		{
			Intern conf=(Intern) e;
			conf.reimbursement();;
		}
	}
}


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR recruit = new HR();
		Finance finance = new Finance();
		Employee emp;
		emp = recruit.empType("I");           //upcast
		if (emp != null)
			finance.procesSalary(emp);
		emp = recruit.empType("C");
		if (emp != null)
			finance.procesSalary(emp);
	}

}
