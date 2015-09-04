package com.sapient.ggn;

import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
			String source = "Now is the time for all good men\n"
					+" to come to the aid of their country\n"
					+" and pay their due taxes.";
			byte buf[]=source.getBytes();
			OutputStream f0 = new FileOutputStreamDemo("file1.txt");
			for(int i=0;i<buf.length;i+=2){
				
			}
	}

}
