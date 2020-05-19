package javaInterviewQuestions;

import java.util.Scanner;

public class FibonacciSeries18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of terms in fibonacci series :: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		if (n > 0) {
			int f0 = 0;
			int f1 = 1;
			int f2 = 0;
			System.out.println("Fibonacci series :: ");
			System.out.print(f0 + "\t" + f1 + "\t");
			for (int i = 2; i < n; i++) {
				f2 = f1 + f0;
				System.out.print(f2 + "\t");
				f0 = f1;
				f1 = f2;
			}
		} else {
			System.out.println("Invalid Input");
		}
	}

}
