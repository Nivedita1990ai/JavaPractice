package javaInterviewQuestions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class GetCurrentTime63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zid = ZoneId.of("Europe/London");
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now(zid));
		System.out.println(new Date());
		System.out.println(new Date(System.currentTimeMillis()));

	}

}
