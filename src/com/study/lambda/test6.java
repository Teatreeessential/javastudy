package com.study.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

class Box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
	
}

public class test6 {
	public static void main(String[] args) {
		
		Box<Integer> box1 = new Box<>();
		Box<Double> box2 = new Box<>();
		
		
		
		BiConsumer<Box<Integer>, Integer> bi1 = (box,i) -> {
			box.setOb(i);
		};
		BiConsumer<Box<Double>, Double> bi2 = (box,d) -> {
			box.setOb(d);
		};
		
		bi1.accept(box1, 5);
		bi2.accept(box2, 5.3);
		
		System.out.println(box1.getOb());
		System.out.println(box2.getOb());
		
		
		
	}
}
