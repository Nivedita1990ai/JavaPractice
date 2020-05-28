package javaInterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArrGivenVal61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 4, 2, 5, 7, 9, 11, 23, 54, 76, 22, 12 };
		System.out.println("Enter number to be searched :: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				System.out.println("No found at " + i + " index");
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("No not found");
		}

		// 2.Arrays method
		int r = Arrays.binarySearch(a, n);
		if (r >= 0 && r < a.length) {
			System.out.println("No is found at : " + r );
		} else {
			System.out.println("No not found");
		}

	}
}