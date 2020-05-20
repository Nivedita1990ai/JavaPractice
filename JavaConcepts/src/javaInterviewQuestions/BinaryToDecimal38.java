package javaInterviewQuestions;

import java.util.Scanner;

public class BinaryToDecimal38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter binary number :: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		//1. binary to decimal 1
		int decNo = Integer.parseInt(str, 2);
		System.out.println("Converted Decimal number :: " + decNo);

		System.out.println("------------------------------------------");
		printDecimalToBinary(decNo);
		System.out.println("------------------------------------------");
		printBinaryToDecimal(Integer.parseInt(str));
	}

	public static void printDecimalToBinary(int decNo) {
		int i = 0;
		int[] binaryNum = new int[1000];
		while (decNo > 0) {
			binaryNum[i] = decNo % 2;
			decNo /= 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binaryNum[j]);
		}
	}

	public static void printBinaryToDecimal(int binNum) {

		int decNo = 0;
		int temp = binNum;
		int base = 1; // 2^1 = 1;

		while (temp > 0) {
			int lastDigit = temp % 10;
			temp /= 10;
			decNo += lastDigit * base;
			base *= 2;
		}
		System.out.println("Binary to Decimal number :: " + decNo);
	}
}
