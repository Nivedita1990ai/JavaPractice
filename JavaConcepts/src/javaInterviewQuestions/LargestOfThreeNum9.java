package javaInterviewQuestions;

public class LargestOfThreeNum9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000;
		int b = 100;
		int c = 10;
		if (a > b && a > c) {
			System.out.println("Largest number is a :: " + a);
		} else if (b > c) {
			System.out.println("Largest number is b :: " + b);
		} else {
			System.out.println("Largest number is c :: " + c);
		}

		if(a>=b) {
			if(a>=c) {
				System.out.println("largest number is a :: "+a);
			}else {
				System.out.println("largest number is c :: "+c);
			}}
		else if (b>=c){
			System.out.println("largest number is b :: "+b);
		}else {
			System.out.println("largest number is c :: "+c);
		}
	}
}
