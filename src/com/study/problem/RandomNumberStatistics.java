package com.study.problem;

import java.util.Hashtable;
import java.util.Set;

public class RandomNumberStatistics {
	
	private final int DATA_BOUNDARY = 50;
	public Hashtable<Integer, Integer> hashtable = new Hashtable<>();
	
	private void getRandomNumberStatics() {
		for(int i = 0;i<5000;i++) {
			int tempNumber = (int) (Math.floor(Math.random()*50)+1);
			putCurrentNumber(tempNumber);
		}
		printStatics();
	}
	
	private void putCurrentNumber(int tempNumber) {
		if(hashtable.containsKey(tempNumber)) {
			hashtable.put(tempNumber,hashtable.get(tempNumber)+1);	
		}else {
			hashtable.put(tempNumber,1);
		}
	}
	private void printStatics() {
		Set<Integer> set = hashtable.keySet();
		for(int key:set) {
			if(key%10-1==0) System.out.println();
			System.out.print(key+"="+hashtable.get(key)+" ");
		}
	}

	public static void main(String[] args) {
		RandomNumberStatistics random = new RandomNumberStatistics();
		random.getRandomNumberStatics();
	}
}
