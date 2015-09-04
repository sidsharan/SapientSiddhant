package com.sapient.ggn;

class Data {
	private int firstNumber;
	private int secondNumber;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		if (arg0 != null && arg0 instanceof Data) {
			Data obj = (Data) arg0;
			if ((firstNumber == obj.firstNumber)
					&& (secondNumber == obj.secondNumber)) {
				return true;
			}
		}
		return false;
	}

}

public class MainApp {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		d1.setFirstNumber(56);
		d2.setFirstNumber(56);
		d1.setSecondNumber(44);
		d2.setSecondNumber(44);
		System.out.println(d1.equals(d2));
	}
}
