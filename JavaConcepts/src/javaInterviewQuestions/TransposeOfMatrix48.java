package javaInterviewQuestions;

public class TransposeOfMatrix48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arrNew = new int[arr[0].length][arr.length];

		for (int i = 0; i < arrNew.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// if (arr.length<=arrNew.length) {
				// System.out.println("arr[" + j + "][" + i + "] :" + arr[j][i]);
				arrNew[i][j] = arr[j][i];
				System.out.println("arrNew[" + i + "][" + j + "] :" + arrNew[i][j]);
				// }
			}
		}

	}

}
