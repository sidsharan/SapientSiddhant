package com.sapient.cui.client;

abstract class A 
{
  int a = 100;
  public abstract void showA(); }

public class B extends A
{
	public void showA()
	{
		// Fill the blank
	}

  public static void main(String []args)
  { 
    A objA = new B();
    objA.showA(); 
  }
}