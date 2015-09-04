package com.sapient.ggn;

class Data {
	private int value;

	public int getValue() {
		return (value);
	}

	public void setValue(int value) {
		this.value = value;
	}

}

class Runner implements Runnable {
	Data data;
	private Thread secondT;

	public Runner() {
		data = new Data();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		Thread currThread;

		int count = 0;
		// TODO Auto-generated method stub

		for (count = 0; count < 10; ++count) {
			currThread = Thread.currentThread();

			if (currThread.getName().toString().equals("Producer")) {

				System.out.println(currThread);
				synchronized (data) {
					if (!secondT.isAlive()) {
						secondT.start();
					}
					data.notify();
					data.setValue(count + 1);
					
						try {
							data.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				
			} else if (currThread.getName().toString().equals("Consumer")) {
				System.out.println(currThread);
				synchronized (data) {
					data.notify();
					System.out.println(data.getValue());
					
					if (count != 9) {
						try {
							data.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						
					}
				}
			}
		}
	}

	public void setSecondThread(Thread secondThread) {
		// TODO Auto-generated method stub
		secondT = secondThread;
	}
}

public class MainAPP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner runner = new Runner();
		Thread firstThread = new Thread(runner, "Producer");
		Thread secondThread = new Thread(runner, "Consumer");
		firstThread.start();
		// secondThread.start();
		runner.setSecondThread(secondThread);
	}

}
