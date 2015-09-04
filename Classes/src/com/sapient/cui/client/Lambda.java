package com.sapient.cui.client;
interface Test{
	public void testing(int i);
}

class Execution
{
	public void call(Test test,int value) {
		test.testing(value);
	}
}
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Execution exec = new Execution();
//INITIAL WAY
//exec.call(new Test(){
//
//	@Override
//	public void testing() {
//		// TODO Auto-generated method stub
//		System.out.println("Executing");
//	}
//	
//});


//LAMBDA EXPRESSION
exec.call((value)->{
	System.out.println("Testing lambda "+value);
},3);
exec.call((value)->{System.out.println("Executing Lambda "+value);},32);
	}
}



