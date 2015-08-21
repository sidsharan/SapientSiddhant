package com.variablearguments;

public class MainApp {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stats stat=new Stats();
		double avg= stat.average(12,12,12,13);
		System.out.println(avg);
	}

}

class Stats
{
	public float average(int... nums)//Variable argunments
	{
		int sum=0;
		for(int x : nums)
		{
			sum+=x;
		}
		return ((float)sum)/nums.length;
		
	}
}
