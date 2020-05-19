package javaInterviewQuestions;

import java.util.Scanner;

public class GenreateMultiplicationTable17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter natural number :: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		System.out.println("Multiplication table :: ");
		if (num > 0) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(num * i+"\t");
			}
		} else {
			System.out.println("Invalid Number.");
		}
	}

}
