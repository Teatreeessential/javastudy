package com.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class test1 {
	public static void main(String[] args) throws IOException {
		try(InputStream in = new FileInputStream("data.dat")){
			int result = in.read();
			System.out.println(result);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
