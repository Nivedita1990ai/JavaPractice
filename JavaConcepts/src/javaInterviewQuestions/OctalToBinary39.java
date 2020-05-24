package javaInterviewQuestions;

import java.util.Scanner;

public class OctalToBinary39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter octal number :: ");
		Scanner scan = new Scanner(System.in);
		int octNo = scan.nextInt();
		scan.close();

		System.out.println("Octal to binary :: "+octalToBinary(octNo));
		System.out.println("Binary to octal :: "+binaryToOctal(octalToBinary(octNo)));
	}

	public static String octalToBinary(int octNo) {
		int decNo = OctalToDecimal38.octalToDecimal(octNo);
		int bin = BinaryToDecimal38.printDecimalToBinary(decNo);
		return Integer.toBinaryString(bin);
	}

	public static int binaryToOctal(String binNo) {
		int decNo = Integer.parseInt(binNo,2);
		int octNo=OctalToDecimal38.decimalToOctal(decNo);
		return octNo;
	}
}
