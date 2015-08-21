package com.src;

public class ArrayRef {

	public static void main(String[] args)
	{
		Point[] x;
		x = createArray();
		for(Point dataitem : x){
			
		
			System.out.print(dataitem.x+ " " + dataitem.y + "\n");
	}
		System.out.println();
	}
	
	public static Point[] createArray()
	{
		Point[] p;
		p = new Point[10];
		for(int i=0;i<10;i++)
		{
			p[i]=new Point(i, i+1);
		}
		return p;
	}
	
}
