package mainpack;

import arithmetic.MathArithmetic;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using lib");

		MathArithmetic arith=new MathArithmetic();
		int sum=arith.sum(10, 20);
		System.out.println(sum);

	}

}
