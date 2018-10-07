package com.study.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test4 {
	public static void main(String[] args) {
		String i = "馬馬馬馬馬馬馬馬馬";
		String o = "醤 鞠劃?";
		
		try(BufferedWriter wt = new BufferedWriter(new FileWriter("C:\\Users\\Ahn\\Desktop\\exp\\data.txt"))){
			wt.write(i,0,i.length());
			wt.newLine();
			wt.write(o, 0, o.length());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader rd = new BufferedReader(new FileReader("C:\\Users\\Ahn\\Desktop\\exp\\data.txt"))){
			while(true) {
				String str;
				str = rd.readLine();
				if(str == null) {
					break;
				}
				System.out.println(str);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
