package com.mainpack;

@SuppressWarnings("serial")
class IllegalAgeException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Need to be 18 or above";
	}
}

class Vote {
	public void register(int age) throws IllegalAgeException {
		if (age < 18) {
			throw new IllegalAgeException();
		}
	}
}

public class MainApp {

	public static void main(String[] args) {

		Vote vote = new Vote();
		try {
			vote.register(16);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
