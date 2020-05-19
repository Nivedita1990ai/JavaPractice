package javaInterviewQuestions;

import java.util.Scanner;

public class FactorialWithoutRecursive16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter natural number :: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		if (num > 0) {
			long fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of " + num + " is :: " + fact);
		} else if (num == 0) {
			System.out.println("Factorial of 0 is :: 1");
		} else {
			System.out.println("Number is invalid. Enter valid number.");
		}
	}

}
