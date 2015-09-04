/**
 * 
 */
package com.sapient.cui.client;

/**
 * @author sshara
 *
 */
public class HR {

		
	
	public Employee empType(String emp) {
		
		try{
			if (emp.equals("I"))
			return new Intern();
		else if (emp.equals("C"))
			return new Confirmed();
		else if (emp.equals("T"))
			return new Contract();
		return null;
	}
	catch(NullPointerException e)
		{
		return null;
		}
	}
}