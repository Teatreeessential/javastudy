package com.my.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quickSort {
	Scanner sc = new Scanner(System.in);
	int i = 1;
	int len;
	static List<Integer> result = new ArrayList<Integer>();

	public quickSort() {

	}

	public List<Integer> set_arr() {
		List<Integer> arr = new ArrayList<>();
		System.out.println("원하시는 길이의 배열을 입력하세요!");
		len = sc.nextInt();
		for (int i = 0; i < len; i++) {
			System.out.println((i + 1) + "번 째 값을 입력해주세요!");
			arr.add(sc.nextInt());
		}
		return arr;
	}

	public void Sort(List<Integer> arr, int start, int end) {
		List<Integer> left_arr = new ArrayList<Integer>();
		List<Integer> right_arr = new ArrayList<Integer>();

		int pivot = end / 2; // pivot의 인덱스 번호값

		System.out.println("피벗의 값은" + pivot);

		if (end == 1) {
			System.out.println("ㅇㅇㅇㅇ");
			result.add(arr.get(pivot));
			return;
		}
		if(end == 2){
			if (arr.get(0) > arr.get(1)) {
				System.out.println("end는 2임");
				result.add(arr.get(1));
				System.out.println(arr.get(1) + "을 result에 더함");
				result.add(arr.get(0));
				System.out.println(arr.get(0) + "을 result에 더함");

				return;
			}
		}else {
			for (int i = start; i < end; i++) {
				if (arr.get(pivot) >= arr.get(i)) {
					left_arr.add(arr.get(i));

				} else {
					right_arr.add(arr.get(i));
				}
			}

			System.out.println(i + "차" + "left의 배열 값");
			showview(left_arr);
			System.out.println();
			System.out.println(i + "차" + "right의 배열 값");
			showview(right_arr);
			System.out.println();
			i++;

			Sort(left_arr, 0, left_arr.size());
			System.out.println("right의 사이즈:" + right_arr.size());
			Sort(right_arr, 0, right_arr.size());
		}

	}

	public void showview(List<Integer> arr) {

		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + ",");

		}
	}

	public void remove(List<Integer> arr, int start, int end) {
		for (int i = start; i < end; i++) {
			arr.remove(i);
		}

	}
}
