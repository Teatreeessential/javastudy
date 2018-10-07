package com.study.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class test2 {

	public static void main(String[] args) {
		int i = 0;
		try(InputStream in = new FileInputStream("data0.dat");
			OutputStream out = new FileOutputStream("data"+1+".dat")) {
			byte[] buf = new byte[1024];
			int len;
			
			while(true) {
				len = in.read(buf);
				if(len == -1)
					break;
				out.write(buf, 0, len);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
