package javaInterviewQuestions;

import java.util.Scanner;

public class CalculatePower24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter base :: ");
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		System.out.println("Enter index :: ");
		int index = scan.nextInt();
		long power = 1;
		boolean flag = false;
		if (base > 0 && index > 0) {
			for (int i = 0; i < index; i++) {
				power = power * base;
				flag = true;
			}
			System.out.println("Calculated power :: " + power);
		} else if (base == 0) {
			power = 1;
			System.out.println("Calculated power :: " + power);
			flag = true;
		} else if (index < 0) {
			int positivePower = Math.abs(index);
			double pow = 1;
			for (int i = 0; i < positivePower; i++) {
				pow = pow * base;
			}
			pow = 1 / pow;
			System.out.println("Calculated power :: " + pow);
			flag = true;

		} else if (base < 0) {
			flag = false;
		} else if (index == 0) {
			power = 1;
			System.out.println("Calculated power :: " + power);
			flag = true;
		}
		if (flag == false)
			System.out.println("Invalid case");
	}

}
