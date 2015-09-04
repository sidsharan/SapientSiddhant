/**
 * 
 */
package com.sapient.cui.client;

/**
 * @author sshara
 *
 */
public class Finance {
	public void procesSalary(Employee e) {
		e.netSalary();
		if (e instanceof Confirmed) {
			Confirmed conf = (Confirmed) e;
			conf.transport();
		}
		if (e instanceof Intern) {
			Intern conf = (Intern) e;
			conf.reimbursement();
			;
		}
		if (e instanceof Contract) {
			Contract contractObject = (Contract) e;
			contractObject.netSalary();
			contractObject.transport();
		}
	}
}