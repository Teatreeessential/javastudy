package com.study.stream;

import java.util.Arrays;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("toy","robot","box");
		list.stream()
			.forEach(s->System.out.println(s));
		
	}

}
