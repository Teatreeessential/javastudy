package com.study.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class test5 {

	public static void main(String[] args) {
		IntStream.of(3,5,2,1)
				 .sorted()
				 .forEach(s->System.out.println(s));
		List<String> list = Arrays.asList("list","toy","hhhhh");
		list = new ArrayList<>(list);
		
		list.stream()
			.sorted((s1,s2) -> s1.length()-s2.length())
			.forEach(s-> System.out.println(s));
	}

}
