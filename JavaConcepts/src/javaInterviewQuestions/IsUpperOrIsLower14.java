package javaInterviewQuestions;

import java.util.Scanner;

public class IsUpperOrIsLower14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter character :: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		char ch = str.charAt(0);
		if(Character.isUpperCase(ch)) {
			System.out.println("Character is in Upper case");
		}else if(Character.isLowerCase(ch)) {
			System.out.println("Character is in Lower case");
		}
	}

}
