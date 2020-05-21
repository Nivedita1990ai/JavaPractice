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
		System.out.println(printDecimalToBinary(decNo));
		System.out.println("------------------------------------------");
		System.out.println(printBinaryToDecimal(Integer.parseInt(str)));
	}

	public static int printDecimalToBinary(int decNo) {
		int i = 0;
		int[] binaryNum = new int[1000];
		while (decNo > 0) {
			binaryNum[i] = decNo % 2;
			decNo /= 2;
			i++;
		}
		String binNum = "";
		for (int j = i - 1; j >= 0; j--) {
			//System.out.print(binaryNum[j]);
			//System.out.println(String.valueOf(binaryNum[j]));
			binNum=binNum.concat(String.valueOf(binaryNum[j]));
		}
		//String binNum = Integer.toBinaryString(decNo);
		int bin = Integer.parseInt(binNum, 2);
		return bin;
	}

	public static int printBinaryToDecimal(int binNum) {

		int decNo = 0;
		int temp = binNum;
		int base = 1; // 2^1 = 1;

		while (temp > 0) {
			int lastDigit = temp % 10;
			temp /= 10;
			decNo += lastDigit * base;
			base *= 2;
		}
		//System.out.println("Binary to Decimal number :: " + decNo);
		return decNo;
	}
}
