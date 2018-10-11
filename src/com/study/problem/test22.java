package com.study.problem;

import java.lang.reflect.Array;
import java.util.List;

import java.util.ArrayList;

public class test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//toArray예제
		List<String> list = new ArrayList<>();
		list.add("개");
		list.add("고양이");
		String[] arr1 = list.toArray(new String[0]);
		String[] arr2 = list.toArray(new String[5]);
		String[] arr3 = list.toArray(new String[1]);
		for(String i: arr3) {
			System.out.println(i);
		}
	}

}
