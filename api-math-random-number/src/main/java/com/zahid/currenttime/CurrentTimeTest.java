package com.zahid.currenttime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date current_date = new Date();
		System.out.println(current_date);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeFormat.format(current_date));
		
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		System.out.println(dateFormat.format(current_date));
//		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(dateFormat.format(current_date));
		
		SimpleDateFormat weekdayFormat = new SimpleDateFormat("EEEE");
		System.out.println(weekdayFormat.format(current_date));
		
		SimpleDateFormat clockFormat = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(clockFormat.format(current_date));
	}

}
