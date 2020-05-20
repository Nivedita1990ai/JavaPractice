package javaInterviewQuestions;

import java.util.Scanner;

public class SimpleCalculatorSwitchCase32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no 1 :: ");
		Scanner scan = new Scanner(System.in);
		int no1 = scan.nextInt();
		System.out.println("Enter no 2 ::");
		int no2 = scan.nextInt();
		System.out.println("Enter operation :: ");
		char ch = scan.next().charAt(0);
		scan.close();
		System.out.println(calculate(no1, no2, ch));
		System.out.println(calculate(no1, no2, '+'));
		System.out.println(calculate(no1, no2, '-'));
		System.out.println(calculate(no1, no2, '*'));
		System.out.println(calculate(no1, no2, '/'));
		System.out.println(calculate(no1, no2, '%'));
		System.out.println(calculate(no1, no2, '='));
	}

	public static int calculate(int no1, int no2, char operator) {
		int result = 0;
		switch (operator) {
		case '+':
			result = no1 + no2;
			break;
		case '-':
			result = no1 - no2;
			break;
		case '*':
			result = no1 * no2;
			break;
		case '/':
			result = no1 / no2;
			break;
		case '%':
			result = no1 % no2;
			break;
		default:
			System.out.println("Invalid operation");
			result = -1;
		}
		return result;
	}
}
