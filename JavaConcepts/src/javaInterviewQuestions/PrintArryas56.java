package javaInterviewQuestions;

public class PrintArryas56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		print1DArray(a);
		System.out.println();
		print2DArray(b);
		
	}

	public static void print1DArray(int[] a) {
		System.out.println("One Dimensional array :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
	
	public static void print2DArray(int[][]b) {
		System.out.println("Two Dimensional Array : ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
