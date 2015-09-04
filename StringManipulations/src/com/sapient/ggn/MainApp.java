package com.sapient.ggn;

	class IndexOfDemo {
		
	    StringBuffer sb = new StringBuffer("one two one");
	    int i;
	    public void methodName(){
	    i = sb.indexOf("one");
	    System.out.println("First index: " + i);

	    i = sb.lastIndexOf("one");
	    System.out.println("Last index: " + i);
}
	}
	
public class MainApp {
    	public static void main(String[] args) {
			IndexOfDemo x=new IndexOfDemo();
			x.methodName();
		}
}
