package javaInterviewQuestions;

import java.util.concurrent.TimeUnit;

public class ConvertMillisToMin64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long mills = 1000000  ;
		long seconds = mills/1000;
		long mins= seconds/60;
		long remSec = mills-(75*60000);
		System.out.println("Remaining seconds : "+remSec);
		remSec = remSec/1000;
		System.out.println("remSec : "+remSec);
		long hr = mins/60;
		System.out.println("Hours :"+hr);
		long newMins=mins-(hr*60);
		System.out.println("Remaining minutes : "+newMins);
		
		System.out.println(mills+" milliseconds is equal to :: "+hr+" hours "+newMins+" minutes "+remSec+" Seconds");
	
		long min = TimeUnit.MILLISECONDS.toMinutes(mills);
		long secs = TimeUnit.MILLISECONDS.toSeconds(mills);
		System.out.println("Minutes :: "+min);
		System.out.println("Seconds :: "+secs);

	
	}

}
