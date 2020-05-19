package javaInterviewQuestions;

public class SwapTwoNumbers6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 33;
		int temp = 0;
		System.out.println("Before a :: " + a);
		System.out.println("Before b :: " + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("After a :: " + a);
		System.out.println("After b :: " + b);

		int p = 11;
		int q = 22;

		System.out.println("Before p :: " + p);
		System.out.println("Before q :: " + q);

		p = p + q;
		q = p - q;
		p = p - q;
		System.out.println("After p :: " + p);
		System.out.println("After q :: " + q);

	}

}