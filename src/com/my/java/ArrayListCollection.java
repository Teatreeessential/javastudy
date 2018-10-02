package com.my.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		for(int i= 0; i<list.size();i++) {
			System.out.println(list.get(i) + '\t');
		}
		list = new LinkedList<>(list);
		for(int i= 0; i<list.size();i++) {
			System.out.println(list.get(i) + '\t');
		}
		
		
	}

}
