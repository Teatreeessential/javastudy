package com.study.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Car1{
	
	private String color;
	private String model;
	
	
	
	public Car1(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	@Override
	public String toString() {
		return "Car1 [color=" + color + ", model=" + model + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(model,color);
	}
	@Override
	public boolean equals(Object obj) {
		if(this.hashCode()==Objects.hash(((Car1)obj).model,((Car1)obj).color)) {
			return true;
		}else {
			return false;
		}
	}
	
	
}


public class test {

	public static void main(String[] args) {
		
		Set<Car1> set = new HashSet<>();
		set.add(new Car1("red","bmw"));
		set.add(new Car1("blue","bmw"));
		set.add(new Car1("red","bmw"));
		
		
		for(Car1 car:set) {
			System.out.println(car.toString()+'\t');
		}
	}

}
