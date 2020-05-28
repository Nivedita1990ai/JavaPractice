package javaInterviewQuestions;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class DifferenceBetPeriods53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date(System.currentTimeMillis());
		Date d2 = new Date(System.currentTimeMillis() + (1000 * 60 * 60 * 24 * 5));
		System.out.println("Date 1 : " + d1);
		System.out.println("Date 2 : " + d2);
		long diffMills = Math.abs(d1.getTime() - d2.getTime());
		long diff = TimeUnit.MILLISECONDS.toDays(diffMills);
		long diffMin = TimeUnit.MILLISECONDS.toMinutes(diffMills);
		System.out.println("Days :: "+diff);
		System.out.println("Minutes :: "+diffMin);
		System.out.println("Days : " + diffMills / (1000 * 60 * 60 * 24));

		// Period
		LocalDate now = LocalDate.now();
		LocalDate tomorrow = now.plusDays(5);
		Period p = Period.between(now, tomorrow);
		int dif = p.getDays();
		System.out.println("Days diff :: " + dif);

	}

}
