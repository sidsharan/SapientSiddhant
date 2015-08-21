package com.sapient.nitro.ggn;

public class Bird extends Animal implements Flyer {

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("Bird Takeoff");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Bird Land");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird Fly");
	}
	
	public void buildNest() {
		
		System.out.println("Birds can build nests");
		
	}

	public void layEggs() {
		
		System.out.println("Bird can lay eggs");
	}
}
