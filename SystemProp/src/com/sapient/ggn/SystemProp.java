package com.sapient.ggn;

import java.util.Enumeration;





public class SystemProp {
	public static void main(String[] args) {
		
		java.util.Properties properties=System.getProperties();
		Enumeration<Object> keys = properties.keys();
		String key="";
		while(keys.hasMoreElements())
		{
			key = (String)keys.nextElement();
			System.out.println(key + " : " + properties.getProperty(key));
		}
		
		
	}
}
