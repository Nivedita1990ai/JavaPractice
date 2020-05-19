package javaInterviewQuestions;

import java.util.Scanner;

public class IsPrimeNumber26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number :: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		if (isPrime(num) == true)
			System.out.println("Number is prime");
		else
			System.out.println("Number id NOT prime");
	}

	public static boolean isPrime(int num) {
		boolean flag = true;
		if (num == 0 || num == 1) {
			flag = false;
		} else if (num > 1) {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
		} else {
			flag = false;
		}
		return flag;
	}
}
