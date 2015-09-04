package com.sapient.ggn;

class Date
{
	private int days;
	private int months;
	private int years;
	
	public Date(int day, int month, int year) {
		// TODO Auto-generated constructor stub
	days=day;
	months=month;
	years=year;
	}

	public Date addDays(int moreDays)
	{
		Date x=new Date(0,0,0);
		x.days=this.days;
		x.months=this.months;
		x.years=this.years;
		x.days+=moreDays;
		return x;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return days+"-"+months+"-"+years;
	}
	
}



public class MainApp
{
	public static void main(String[] args) {
		Date my_birth = new Date(22, 7, 1964);
		Date the_next_week = my_birth.addDays(7);
		System.out.println(the_next_week);
		System.out.println(my_birth);
	}
}



















