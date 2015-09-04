package com.sapient.nitro;

class Runner implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside Run Method");
		System.out.println();
	}
	
}
public class MainApp {
		static Runner runner = new Runner();
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread firstThread = new Thread(runner, "My Thread");
			System.out.println(firstThread.getState());
			System.out.println(firstThread);
			firstThread.start();
			System.out.println(firstThread.getState());
			System.out.println("END");
			//firstThread.destroy();
			//firstThread.stop();
			System.out.println(firstThread.getState());
			
			System.out.println(Thread.currentThread());
	}

}
