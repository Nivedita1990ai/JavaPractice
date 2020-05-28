package javaInterviewQuestions;

public class ComplexAddition52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar = 2;
		int ai = 2;
		int br = 3;
		int bi = -3;
		int[] a = { ar, ai };
		int[] b = { br, bi };
		int[] c = add(a, b);
		System.out.println("Result :: "+c[0]+"+("+c[1]+")i");
	}

	private static int[] add(int[] a, int[] b) {
		int[] c = new int[2];
		c[0] = a[0] + b[0];
		c[1] = a[1] + b[1];
		return c;
	}

}
