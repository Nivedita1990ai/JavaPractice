package javaInterviewQuestions;

import java.util.Scanner;

public class PalindromeNumberCheck25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number :: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		if (num > 10) {
			int reverse = 0;
			int n = num;
			while (n > 0) {
				reverse = reverse * 10 + n % 10;
				n = n / 10;
			}
			if(reverse==num) {
				System.out.println("Number is palindrome");
			}else {
				System.out.println("Number is NOT palindrome");
			}
		} else {
			System.out.println("Invalid input");
		}
	}

}
