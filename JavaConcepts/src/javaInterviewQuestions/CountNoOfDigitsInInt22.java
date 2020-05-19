package javaInterviewQuestions;

import java.util.Scanner;

public class CountNoOfDigitsInInt22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		//1. with string length
		String str = Integer.toString(num);// ----1
		str = String.valueOf(num); // ----2
		str = String.format("%d", num); // ----3
		System.out.println(str);
		System.out.println("No of digits in number :: " + str.length());

		//2. with division
		num = Integer.parseInt(str);
		int n = num;
		int digits = 0;
		while (n > 0) {
			n = n / 10;
			digits++;
		}
		System.out.println("No of digits in number with division :: "+digits);
	}

}
