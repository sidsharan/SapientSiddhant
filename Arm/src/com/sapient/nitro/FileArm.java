package com.sapient.nitro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileArm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try (FileInputStream in = new FileInputStream(
				"D:/Workspace/SapientSiddhant/Arm/sapin.txt");
				FileOutputStream out = new FileOutputStream(
						"D:/Workspace/SapientSiddhant/Arm/sapout.txt");) {
			int c;
			while ((c = in.read()) != -1)
				out.write(c);

		}
	}

}
