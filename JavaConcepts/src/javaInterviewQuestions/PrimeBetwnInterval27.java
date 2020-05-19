package javaInterviewQuestions;

import java.util.Scanner;

public class PrimeBetwnInterval27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter lesser number :: ");
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		System.out.println("Enter higher number :: ");
		int h = scan.nextInt();
		scan.close();
		if (l > 1 && h > 1 && h >= l) {
			for (int i = l; i <= h; i++) {
				if (IsPrimeNumber26.isPrime(i)) {
					System.out.print(i + "\t");
				}
			}
		} else {
			System.out.println("Invalid Input");
		}
	}

}
