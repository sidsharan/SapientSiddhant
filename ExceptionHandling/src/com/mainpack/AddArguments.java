package com.mainpack;

public class AddArguments {
			public static void main(String[] args)throws ArithmeticException {
				try{
					
				
				int sum=0;
				for(String arg : args)
				{
					sum+=Integer.parseInt(arg);
				}
				System.out.println("Sum = " + sum);
				}
	catch (NumberFormatException ntr)
	{
		System.err.println("One of the command line arguments is not an integer");
	}
	
}
}