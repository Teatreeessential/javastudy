package com.study.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class test4 {

	public static void main(String[] args) {
		List<Integer> int_list = Arrays.asList(1,2,3,5);
		int_list = new ArrayList<Integer>(int_list);
		
		List<Double> double_list = Arrays.asList(0.0,1.2,1.5,-3.5);
		double_list = new ArrayList<Double>(double_list);
		
		Predicate<Number> p = n -> n.doubleValue() < 0.0;
		
		int_list.removeIf(p);
		double_list.removeIf(p);
		
		System.out.println(int_list);
		System.out.println(double_list);
		
	}

}
