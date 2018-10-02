package com.study.generic;

class Box<T> {
	private T ob;
	public void set(T o) { ob = o;}
	public T get() {return ob;}
}

class Toy{
	public String toString() {return "im a toy";}
}

class Robot extends Toy{
	@Override
	public String toString() {return "im a robot";} 
}

class Car extends Toy{
	@Override
	public String toString() {return "im a robot";} 
}

class Boxhandler{
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.get();
		System.out.println(t);
	}
	public static <T> void inBox(Box<? super T> box, T n) {
		box.set(n);
		
		
	}
}


class main{
	
	public static void main(String[] arg) {
		Box<Robot> box = new Box<>();
		
		Boxhandler.inBox(box, new Robot());
		Boxhandler.outBox(box);
	}
}




