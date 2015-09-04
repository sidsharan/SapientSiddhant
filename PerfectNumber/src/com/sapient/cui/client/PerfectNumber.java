/**
 * 
 */
package com.sapient.cui.client;

/**
 * @author sshara
 *
 */
public class PerfectNumber {

	public boolean checkForPerfect(int number) {
		if(number <= 0){
			return false;
		}
		int counter = 1;
		int sumOfDivisors = 0;
		for (; counter <= Math.sqrt(number); ++counter) {
			if ((number % counter) == 0) {
				sumOfDivisors += counter;
			}
		}
		if (sumOfDivisors == number) {
			return true;
		}
		return false;
	}

}
