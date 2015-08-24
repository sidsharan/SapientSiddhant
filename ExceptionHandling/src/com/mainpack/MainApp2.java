package com.mainpack;

import java.io.IOException;
import java.sql.SQLException;


class Base
{
	public void test()throws SQLException,IOException {
		System.out.println("Base");
	}
}

class Derived extends Base
{
	public void test() throws IOException {
		System.out.println("Derived");
	}
}



public class MainApp2 {
			public static void main(String[] args) {
				Base b=new Derived();
				try {
					b.test();
				} catch (IOException|SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
