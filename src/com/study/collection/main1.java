package com.study.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car>{
	
	private int dspl;
	
	public Car(int dspl) {
		super();
		this.dspl = dspl;
	}

	public int getDspl() {
		return dspl;
	}

	public void setDspl(int dspl) {
		this.dspl = dspl;
	}

	@Override
	public String toString() {
		return "Car [dspl=" + dspl + "]";
	}

	@Override
	public int compareTo(Car o) {
		return dspl-o.dspl;
	}
	
	
}

class ECar extends Car {
	
	private int dspl;
	private int battery;
	
	public ECar(int dspl,int battery) {
		super(dspl);
		this.dspl = dspl;
		this.battery = battery;
		// TODO Auto-generated constructor stub
	}

	public int getDspl() {
		return dspl;
	}

	public void setDspl(int dspl) {
		this.dspl = dspl;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	@Override
	public int compareTo(Car o) {
		return battery - ((ECar)o).battery;
	}
	

	@Override
	public String toString() {
		return "ECar [dspl=" + dspl + ", battery=" + battery + "]";
	}
	
	
	
}

public class main1 {

	public static void main(String[] args) {
		Car c1 = new Car(500);
		Car c2 = new Car(300);
		Car c3 = new Car(200);
		
		ECar e1 = new ECar(100, 400);
		ECar e2 = new ECar(250, 2500);
		ECar e3 = new ECar(50, 360);
		
		List<Car> list = Arrays.asList(c1,c2,c3);
		list = new ArrayList<>(list);
		
		List<Car> Elist = Arrays.asList(e1,e2,e3);
		Elist = new ArrayList<>(Elist);
		
		main1.show(Elist);
		main1.show(list);
		
		

	}
	
	public static void show(List<? extends Car> list) {
		System.out.println("정렬전");
		for(Car c:list) {
			System.out.println(c.toString());
		}
		
		
		
		System.out.println("정렬후");
		Collections.sort(list);
		for(Car c:list) {
			System.out.println(c.toString());
		}
	}

}
