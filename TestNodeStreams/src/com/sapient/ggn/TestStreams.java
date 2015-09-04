package com.sapient.ggn;

import java.io.File;

public class TestStreams {
	static void p(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("D:/sapient.txt");
		p("File Name : " + f1.getName());
		p("PAth : " + f1.getPath());
		p("Absolute Path : "+f1.getAbsolutePath());
		p("Parent : " + f1.getParent());
		p(f1.exists()? "exists": "does not exist");
		p(f1.canWrite()? "is writeable": "is not writeable");
		p(f1.canRead()?"is readable": "is not readable");
		p("is " + (f1.isDirectory()?" a directory": "not a directory"));
		p(f1.isFile()? "is a normal file":"might be a named pipe");
		p(f1.isAbsolute()? "is absolute" :"is not absolute");
		p("File last modified "+ f1.lastModified());
		p("File Size " + f1.length() + "bytes");
		
		
	}

}
