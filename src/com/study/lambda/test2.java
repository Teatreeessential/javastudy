package com.study.lambda;


@FunctionalInterface
interface cal<T>{
	T plus(T a, T b);
}

public class test2 {

	public static void main(String[] args) {
		
		cal<Integer> cal = (a,b) -> a+b;
		System.out.println(cal.plus(4, 5));
	}

}
