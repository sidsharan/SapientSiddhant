package com.sapient.nitro;

class Runner2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Run Method");
		for(int count=0;count<10;++count)
		{
			System.out.println(Thread.currentThread());
		}
	}
	
}
public class MainApp2 {
		static Runner2 runner = new Runner2();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread firstThread = new Thread(runner, "My Thread");
			Thread secondThread = new Thread(runner, "Second Thread");
			firstThread.start();
			secondThread.start();
			
			try {
				//firstThread.join();
				secondThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("END");
			
	}

}
