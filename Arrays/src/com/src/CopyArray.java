package com.src;

public class CopyArray {
					
	
	public static void main(String[] args) {
					
			int[]n=new int[5];
			n[1]=23;
			int[] x;
			x = new int[n.length];
			
			System.arraycopy(n, 0, x, 0, n.length);
			n=null;
			for(int data : x)
				System.out.println(data);
		
		
	}
	
	
}
