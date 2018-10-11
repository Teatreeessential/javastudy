package com.study.problem;

public class test21 {
	public static void TestGetMax() {
		System.out.println(getMax(1,2,3));
		System.out.println(getMax(3,16,5));
		
	}
	public static void TestGetMin() {
		System.out.println(getMin(1,2,3));
		System.out.println(getMin(3,16,5));
		
	}
	
	private static <T extends Comparable<T>> T getMax(T ...a) {
		T maxT = a[0];
		for(T tempT:a) {
			if(tempT.compareTo(maxT)>0) maxT = tempT;
		}
		return maxT;
	}
	
	private static <T extends Comparable<T>> T getMin(T ...a) {
		T minT = a[0];
		for(T tempT:a) {
			if(minT.compareTo(tempT) > 0) minT = tempT; 
		}
		return minT;
	}

	public static void main(String[] args) {
		TestGetMax();
		TestGetMin();
	}
}
