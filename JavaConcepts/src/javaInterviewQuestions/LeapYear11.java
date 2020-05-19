package javaInterviewQuestions;

import java.util.Scanner;

public class LeapYear11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year :: ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		scan.close();
		boolean isLeap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeap = true;
				} else {
					isLeap = false;
				}
			} else {
				isLeap = true;
			}
		} else {
			isLeap = false;
		}
		
		if(isLeap) {
			System.out.println("Year "+year+" is Leap year.");
		}else {
			System.out.println("Year "+year+" is NOT a Leap year.");
		}
	}

}
