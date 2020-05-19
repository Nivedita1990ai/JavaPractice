package javaInterviewQuestions;

import java.util.Scanner;

public class IsArmstrongNumber28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number :: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		if (num >= 0) {
			if (isArmstrongNo(num)) {
				System.out.println("Number is Armstrong number");
			} else {
				System.out.println("Number is NOT Armstrong number");

			}
		} else {
			System.out.println("Invalid Input");
		}
	}

	public static boolean isArmstrongNo(int num) {
		boolean flag = false;
		int n = num;
		long sumOfProd = 0;
		int digit = 0;
		int noOfDigits = 0;
		while (n > 0) {
			noOfDigits++;
			n = n / 10;
		}
		n = num;
		if (noOfDigits > 1) {
			while (n > 0) {
				digit = n % 10;
				sumOfProd = sumOfProd + noProduct(digit, noOfDigits);
				n = n / 10;
			}
		}
		if (sumOfProd == num || num == 1 || num == 0) {
			flag = true;
		}

		return flag;
	}

	public static long noProduct(int num, int noOfDigits) {
		long product = 1;
		for (int i = 0; i < noOfDigits; i++) {
			product = product * num;
		}
		return product;
	}

}
