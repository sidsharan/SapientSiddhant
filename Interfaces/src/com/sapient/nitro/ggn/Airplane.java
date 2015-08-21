package com.sapient.nitro.ggn;

public class Airplane  extends Vehicle implements Flyer{

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("Airplane Takeoff");

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Airplane Land");

	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Airplane Fly");

	}
	

}
