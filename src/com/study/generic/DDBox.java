package com.study.generic;

public class DDBox<K,V> {
	private K in1;
	private V in2;
	
	
	
	public DDBox() {
		super();
	}

	public DDBox(K in1, V in2) {
		super();
		this.in1 = in1;
		this.in2 = in2;
	}

	public K getIn1() {
		return in1;
	}

	public void setIn1(K in1) {
		this.in1 = in1;
	}

	public V getIn2() {
		return in2;
	}

	public void setIn2(V in2) {
		this.in2 = in2;
	}

	@Override
	public String toString() {
		return "DDBox [in1=" + in1 + ", in2=" + in2 + "]";
	}
	
	
	
}
