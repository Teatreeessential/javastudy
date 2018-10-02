package com.study.generic;

import java.util.Set;
import java.util.TreeSet;

class present implements Comparable<present>{
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
	public int compareTo(present o) {
		return o.name.length()-this.name.length();
	}

	@Override
	public String toString() {
		return "present [name=" + name + "]";
	}
	
	
	
}


public class test1 {
	public static void main(String[] args) {
		Set<present> set = new TreeSet<>();
		
		set.add(new present("Doll"));
		set.add(new present("Car"));
		set.add(new present("Money"));
		
		for(present p:set) {
			System.out.println(p.toString());
		}
	}
}
