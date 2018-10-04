package com.study.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



class people{
	private String name;
	private int age;
	
	public people(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "people [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class test1 {

	public static void main(String[] args) {
		List<people> list = Arrays.asList(new people("하하",29),new people("후후",27));
		list = new ArrayList<>(list);
		
		Comparator<people> comp = (a,b) -> a.getAge() - b.getAge();
		Collections.sort(list,comp);
		
		for(people p: list) {
			System.out.println(p.toString());
		};
		Iterator<people> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
			
			if("하하"==itr.next().getName()) {
				itr.remove();
				continue;
			}
			System.out.println(itr.next().toString());
		}


		
		
	}

}
