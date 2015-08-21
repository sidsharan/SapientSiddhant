package com.src;

public class MainArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Begin");

				/*int[] num,ref;
				
				num=new int[10];
				
				ref=num;
				
				ref[4] = 5;
				
				System.out.println(num[4]);

				//for(int counter=0;counter<num.length;counter++)
					//System.out.println(num[counter]);
					for(int data:num)
						System.out.println(data);//enhanced for loop
				 */
				
				Process p=new Process();
				int[] src=p.create();
				p.display(src);
				
				
	
	}

}

class Process
{
	public int[] create()
	{
		int[] num;
		
		num = new int[10];
	
		num[6]=num[7]=56;
		return num ;
	}
	
	public void display(int []src)
	{
		for(int data:src)
			System.out.println(data);
	}
}
