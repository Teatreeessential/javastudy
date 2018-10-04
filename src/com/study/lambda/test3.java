package com.study.lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class PredictShow{
	public static <T> void show(Predicate<T> p,List<T> list) {
		
        for(T n : list) {
            if(p.test(n))
                System.out.println(n);
        }
		
		
	}
}


public class test3 {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,6,2,8);
		PredictShow show = new PredictShow();
		
		show.show(n -> n%3 != 0, list);
		
		
	}
}
