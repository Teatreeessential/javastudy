package com.my.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	       quickSort q = new quickSort();
			Scanner sc = new Scanner(System.in);
	       List<Integer> arr = new ArrayList<>();
	       System.out.println("원하시는 배열의 크기를 입력하시오");
	       int len = sc.nextInt();
	       for(int i=0;i<len;i++) {
	    	   arr.add(sc.nextInt());
	       }

	       q.Sort(arr, 0, arr.size());
	      
	       System.out.print("result값은?");
	       System.out.print(q.result);
	}

}
