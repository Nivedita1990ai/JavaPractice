package javaInterviewQuestions;

import java.util.Arrays;

public class AddTwoMatrices45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = { { 4, 5, 6 }, { 1, 2, 3 }, { 1, 1, 1 } };
		int[][] arr2 = { { 1, 3, 5 }, { 2, 4, 6 } };

		int[][] result;
		int rows = 0;
		int columns = 0;
		int[] zeros;
		int[][] newArr ;
		if (arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
			result = new int[arr1.length][arr1[0].length];
		} else {
			if (arr1.length < arr2.length) {
				rows = arr2.length;
				zeros = new int[arr2.length];
				Arrays.fill(zeros, 0);
				newArr = new int[rows][arr1[0].length];
				for (int i = 0; i < newArr.length; i++) {
					for (int j = 0; j < newArr.length; j++) {
						newArr[i][j]=arr1[i][j];
				}
				
				arr1[3] = zeros;
			} else {
				rows = arr2.length;
				zeros = new int[arr1[0].length];
				Arrays.fill(zeros, 0);
				arr2[3] = zeros;
			}
			if (arr1[0].length < arr2[0].length) {
				columns = arr1[0].length;
			} else
				columns = arr2.length;
			result = new int[rows][columns];
		}

//		System.out.println("Arr1 length : " + arr1.length);
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				result[i][j] = arr1[i][j] + arr2[i][j];
//
//			}
//		}

		for (int i = 0; i < arr2.length; i++) {
			for (int k = 0; k < arr2[i].length; k++) {
				System.out.print(arr2[i][k] + "\t");
			}
			System.out.println();
		}
//		for (int i = 0; i < result.length; i++) {
//			for (int k = 0; k < result[i].length; k++) {
//				System.out.print(result[i][k] + "\t");
//			}
//			System.out.println();
//		}
	}

}
