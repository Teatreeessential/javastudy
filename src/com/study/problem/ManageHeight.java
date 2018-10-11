package com.study.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManageHeight {
	
	public static ArrayList<ArrayList<Integer>> gradeHeigts = new ArrayList<>();

	public static void setData() {
		List<Integer> grade1 = Arrays.asList(170,180,173,175,177);
		grade1 = new ArrayList<>(grade1);
		List<Integer> grade2 = Arrays.asList(160,165,167,186);
		grade2 = new ArrayList<>(grade2);
		List<Integer> grade3 = Arrays.asList(158,177,187,176);
		grade3 = new ArrayList<>(grade3);
		List<Integer> grade4 = Arrays.asList(173,182,181);
		grade4 = new ArrayList<>(grade4);
		List<Integer> grade5 = Arrays.asList(170,180,165,177,172);
		grade5 = new ArrayList<>(grade5);
		gradeHeigts.add((ArrayList<Integer>) grade1);
		gradeHeigts.add((ArrayList<Integer>) grade2);
		gradeHeigts.add((ArrayList<Integer>) grade3);
		gradeHeigts.add((ArrayList<Integer>) grade4);
		gradeHeigts.add((ArrayList<Integer>) grade5);
		
	}
	public static void printHeight(int class_num) {
		System.out.println("class num:"+(class_num+1));
		for(int i:gradeHeigts.get(class_num)) {
			
			System.out.println(i);
		}
		
	}
	public static void printAverage(int class_num) {
		System.out.println("class num:"+(class_num+1));
		int sum = 0;
		double avg = 0;
		
		for(int i:gradeHeigts.get(class_num)) {
			sum += i;
		}
		System.out.println(gradeHeigts.get(2));
		avg = sum/gradeHeigts.get(class_num).size();
		System.out.println("Average:" +avg);
		
	}
	
	public static void main(String[] args) {
		setData();
		for(int i=0;i<gradeHeigts.size();i++) {
			printHeight(i);
		}
		for(int i=0;i<gradeHeigts.size();i++) {
			printAverage(i);
		}
	}

}
