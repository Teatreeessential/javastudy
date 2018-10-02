package com.study.generic;

public class DBox<K,V> {
	private K left;
	private V right;
	
	public DBox(K left, V right) {
		super();
		this.left = left;
		this.right = right;
	}

	public K getLeft() {
		return left;
	}

	public void setLeft(K left) {
		this.left = left;
	}

	public V getRight() {
		return right;
	}

	public void setRight(V right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "DBox [left=" + left + ", right=" + right + "]";
	}
	
	
	
}
