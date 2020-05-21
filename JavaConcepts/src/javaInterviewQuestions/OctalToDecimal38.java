package javaInterviewQuestions;

import java.util.Scanner;

public class OctalToDecimal38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter octal number :: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int octNo = Integer.parseInt(str);
		scan.close();

		// 1. Octal to decimal with Integer.parseInt
		int decNo = Integer.parseInt(str, 8);
		System.out.println("Octal to decimal 1 :: " + decNo);
		// 2. Octal to decimal with custom calculations
		System.out.println("Octal to decimal 2 :: " + octalToDecimal(octNo));
		// 3. Decimal to Octal woth calculations
		System.out.println("Decimal to octal :: " + decimalToOctal(octalToDecimal(octNo)));
	}

	public static int octalToDecimal(int octNo) {
		int decNo = 0;
		int temp = octNo;
		int base = 1;
		while (temp > 0) {
			int lastDigit = temp % 10;
			temp /= 10;
			decNo += lastDigit * base;
			base *= 8;
		}
		return decNo;
	}

	public static int decimalToOctal(int decNo) {
		int temp = 1;
		int octNo = 0;
		while (decNo != 0) {
			octNo += (decNo % 8) * temp;
			decNo /= 8;
			temp *= 10;
		}
		return octNo;
	}

}
