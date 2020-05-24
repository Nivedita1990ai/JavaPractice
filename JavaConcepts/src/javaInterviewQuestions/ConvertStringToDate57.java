package javaInterviewQuestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate57 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String strDate = "22/03/2020";
		String givenFormat = "dd/MM/yyyy";
		String expectedFormat = "EEE dd***MM***yyyy";
		System.out.println(stringToDate(strDate,givenFormat, expectedFormat));
	}

	public static String stringToDate(String strdate,String giveString, String expectedFormat) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(giveString);
		Date date = sdf.parse(strdate);
		sdf = new SimpleDateFormat(expectedFormat);
		return sdf.format(date);
	}

}
