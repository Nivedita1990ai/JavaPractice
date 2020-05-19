package javaInterviewQuestions;

import java.util.Scanner;

public class ArmstrongNoInInterval29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter lesser number :: ");
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		System.out.println("Enter higher number :: ");
		int h = scan.nextInt();
		scan.close();
		if (l >= 0 && h >= 0 && h >= l) {
			for (int i = l; i <= h; i++) {
				if (IsArmstrongNumber28.isArmstrongNo(i)) {
					System.out.print(i + "\t");
				}
			}
		} else {
			System.out.println("Invalid Input");
		}
	}

}
