package com.study.generic;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class present {
	private String name;
	
	

	public present(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "present [name=" + name + "]";
	}
	
	
	
}

class comp implements Comparator<present>{

	@Override
	public int compare(present o1, present o2) {
		return o1.getName().length() - o2.getName().length();
	}
	
}


public class test1 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("doll");
		set.add("abc");
		set.add("cds");
		
		
		for(String s:set) {
			System.out.println(s);
		}
	}
}
