/**
 * 
 */
package com.sapient.cui.client;

/**
 * @author sshara
 *
 */
public class Contract extends Employee {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sapient.cui.client.Employee#netSalary()
	 */
	@Override
	void netSalary() {
		// TODO Auto-generated method stub
		System.out.println("Contractual Employee's Salary");
	}

	public void transport() {
		System.out.println("Transport facility for Contractual Employee");
	}
}