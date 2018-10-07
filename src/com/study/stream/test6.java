package com.study.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class test6 {
	
	public static void main(String[] args) {
		String[] words = {"hello","box","robot","toy"};
		Stream<String> ss = Arrays.stream(words);
		List<String> list = ss.filter(s -> s.length()<5)
							  .collect(()->new ArrayList<>(),
									  (c,s)->c.add(s),
									  (lst1,lst2) -> lst1.addAll(lst2));
		System.out.println(list);
	}
}
