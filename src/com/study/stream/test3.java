package com.study.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box<T>{
	private T ob;

	public Box(T ob) {
		super();
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
	
}


public class test3 {
	public static void main(String[] args) {
		
		List<Box> list = Arrays.asList(new Box("toy"),new Box("robot"));
		list = new ArrayList<>(list);
		
		list.stream()
			.map(box -> box.getOb())
			.forEach(s -> System.out.println(s));
	}
}
