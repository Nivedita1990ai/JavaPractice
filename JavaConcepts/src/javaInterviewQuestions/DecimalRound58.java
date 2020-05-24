package javaInterviewQuestions;

import java.text.DecimalFormat;

public class DecimalRound58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 3.142512432;
		System.out.println(roundDouble(7, d));

	}

	public static double roundDouble(int places, double d) {
		String format = ".";
		for (int i = 0; i < places; i++) {
			format = format.concat("#");
		}
		DecimalFormat dec = new DecimalFormat(format);
		String s = dec.format(d);
		return Double.parseDouble(s);
	}

}
