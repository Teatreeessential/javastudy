package com.study.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

class IntpredictDemo{
	public static int sum(IntPredicate p,List<Integer> list) {
		int result = 0;
		for(int t:list) {
			if(p.test(t)) {
				result+=t;
			}
			
		}
		return result;
	}
	public static int sum(BiPredicate<Integer, Integer> p ,List<Integer> list) {
		int result = 0;
		for(int t:list) {
			if(p.test(t, 10)) {
				result=+t;
			}
			
		}
		return result;
	}
	
	
}


public class test5 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list = new ArrayList<>(list);
		//짝수값만 더하기
		int result = IntpredictDemo.sum(n -> n%2==0, list);
		System.out.println(result);
		result = IntpredictDemo.sum((t,n) -> t+n>=10, list);
		System.out.println(result);
	}

}
