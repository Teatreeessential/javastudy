package com.study.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class test1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int result = Arrays.stream(arr)
					.filter(n-> n%2==0)
					.sum();
		System.out.println(result);

	}

}
