package com.study.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

class ReportCard {
	private int kor;
	private int eng;
	private int math;
	
	public ReportCard(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}


public class test4 {
	public static void main(String[] args) {
		
		ReportCard[] arr = {
			new ReportCard(98, 23, 32),
			new ReportCard(98, 23, 32),
			new ReportCard(98, 23, 32)
		};
		
		Double avg = Arrays.stream(arr)
					.flatMapToInt(s->IntStream.of(s.getEng(),s.getKor(),s.getMath()))
					.average()
					.getAsDouble();
		
		System.out.println(avg);
	}
}
