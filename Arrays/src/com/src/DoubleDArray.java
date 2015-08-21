package com.src;

public class DoubleDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					System.out.println("Begin");
					/*
					int[][] num;
					num= new int[5][3];
					num[1][1]=1;
					for(int dimension1[] : num)
							for(int dimension2 : data)
								System.out.println(dimension2);*/
					
					int[][][] array = new int [5][3][2];
					
					array[1][2][1]=array[2][1][0]=77;
					
					for(int[][] dimension1:array)
						for(int[] dimension2 : dimension1 )
							for (int dimension3 : dimension2)
								System.out.println(dimension3);
					
							
					
	}

}
