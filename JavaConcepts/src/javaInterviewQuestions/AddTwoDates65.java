package javaInterviewQuestions;

import java.util.Calendar;
import java.util.Date;

public class AddTwoDates65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		Date d2 = new Date();
		long time = d1.getTime()+d2.getTime();
		Date d3 = new Date(time);
		System.out.println("Date 1 : "+d1);
		System.out.println("Date 2 : "+d2);
		System.out.println("Added date : "+d3);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		Calendar cTotal = (Calendar)c1.clone();
		time = c1.getTimeInMillis()+c2.getTimeInMillis();
		cTotal.setTimeInMillis(time);
		System.out.println("Calendar total :: "+cTotal.getTime());
	}

}
