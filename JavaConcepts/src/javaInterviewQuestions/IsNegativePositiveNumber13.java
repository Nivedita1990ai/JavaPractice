package javaInterviewQuestions;

import java.util.Scanner;

public class IsNegativePositiveNumber13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :: ");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		scan.close();
		if (no < 0) {
			System.out.println("No " + no + " is negative.");
		} else if (no > 0) {
			System.out.println("No " + no + " is positive.");
		}else {
			System.out.println("No is neither positive nor negative.");
		}
	}

}
