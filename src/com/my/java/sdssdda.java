package com.my.java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class sdssdda {
	
    
  public static void main(String[] args) {
	    LocalDate today = LocalDate.now();
		LocalTime systime = LocalTime.now();
		Calendar c = Calendar.getInstance();
	    

		
		String day;

		day = String.valueOf(today.getYear());

		if (today.getMonthValue() < 10) {
			day += "0" + today.getMonthValue();
		} else {
			day += today.getMonthValue();
		}
        if(today.getDayOfMonth()<10) {
        	day += "0" + today.getDayOfMonth();
        }else {
        	day+= today.getDayOfMonth();
        }
	      System.out.println(day);
	      
	      String sysdate = day;

			int yy = Integer.parseInt(day.substring(0, 4));
			int mm = Integer.parseInt(day.substring(4, 6));
			int dd = Integer.parseInt(day.substring(6));

			c.set(yy, mm - 1, dd); // ���糯¥
			c.add(Calendar.MONTH, -1); // �Ѵ� ������ �ǵ��ư�

			int y = c.get(Calendar.YEAR);
			int m = c.get(Calendar.MONTH) + 1;
			int d = c.get(Calendar.DATE);
			day = String.valueOf(y) + String.valueOf((m > 9 ? m : "0" + m)) + String.valueOf((d > 9 ? d : "0" + d));
			System.out.println(day);// ���糯¥�� ���� �Ѵ��� �κ��� ����
			
		
}
	/*public void start_date(String sysdate) {
		
	}

	// ���糯¥
	public void sysdate() {

		
          
		
	
           
	   System.out.println(day);
	}

	// ����ð�
	public void Getsystime() {
		
*/
	}



