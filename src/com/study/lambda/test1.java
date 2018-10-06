package com.study.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class test1 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		list1 = new ArrayList<>(list1);
		List<Double> list2 = Arrays.asList(1.0,2.3,3.5,4.6);
		list2 = new ArrayList<>(list2);
		
		Predicate<Number> p = n -> n.intValue()%2==0;
		//여기서 n은 number 타입 이기 때문에 기본 자료형 처럼 나누기나 곱하기를 할 수 없다. number타입 객체이기 때문에
		//따라서 .intvalue등을 통해서 그 값을 만들어낸다.
		
		list1.removeIf(p);
		System.out.println(list1);
		list2.removeIf(p);
		System.out.println(list2);
		
		
	}
}
