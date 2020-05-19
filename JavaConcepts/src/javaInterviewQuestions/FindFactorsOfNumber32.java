package javaInterviewQuestions;

import java.util.Scanner;

public class FindFactorsOfNumber32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number :: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		if (num > 0) {
			System.out.println("Factors :: ");
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.print(i + "\t");
				}
			}
		}else
			System.out.println("Invalid input");
	}

}
