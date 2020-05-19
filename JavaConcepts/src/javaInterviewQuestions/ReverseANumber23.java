package javaInterviewQuestions;

import java.util.Scanner;

public class ReverseANumber23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		//1. With loop
		int reverse = 0;
		int n = num;
		while (n > 0) {
			reverse = reverse *10+ (n % 10) ;
			n = n / 10;
		}
		System.out.println("Reverse number :: "+reverse);
		
		//2. With StringBuilder or StringBuffer
		StringBuffer str = new StringBuffer(Integer.toString(num));
		System.out.println("Reverse number with StringBuffer :: "+Integer.valueOf(str.reverse().toString()));
	}

}
