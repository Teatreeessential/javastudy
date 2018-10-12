package e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread {
	
	
	public void printCurrentTime() {
		Date date = new Date();
		System.out.print(date +" ");
		System.out.println(System.currentTimeMillis());
		
	}
	
	public void run() {
		int i = 0;
		while(i<10) {
			printCurrentTime();
			try {
				Thread.sleep(1000);
				i++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
