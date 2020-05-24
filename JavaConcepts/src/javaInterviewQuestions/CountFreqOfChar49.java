package javaInterviewQuestions;

import java.util.Scanner;

public class CountFreqOfChar49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love harry potter books and movies";
		System.out.println("Enter the char :: ");
		Scanner scan =  new Scanner(System.in);
		String s = scan.next();
		char ch = s.charAt(0);
		
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("No of times character is present in the string :: "+count);
	}

}
