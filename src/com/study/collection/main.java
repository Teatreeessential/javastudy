package com.study.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("서영진","신창선");
		list = new ArrayList<>(list);
		list.add("안병찬");
		list.add("하하하");
		
		Iterator<String> itr = list.iterator();
		
		for(String s: list) {
			System.out.println(s);
		}
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}
