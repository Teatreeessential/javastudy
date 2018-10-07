package com.study.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class test3 {

	public static void main(String[] args) {
		int i = 1;
		try(OutputStream out = new FileOutputStream("data.dat")){
			out.write(i);
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
