package javaInterviewQuestions;

import java.util.Scanner;

public class SumOfNaturalNumber15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter natural number :: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		if (num > 0) {
			int sum=0;
			for (int i = 1; i <= num; i++) {
				sum = sum+i;
			}
			System.out.println("Sum of "+num+" natural numbers :: "+sum);
		} else {
			System.out.println("Invalid number. Enter valid number.");
		}
	}

}
