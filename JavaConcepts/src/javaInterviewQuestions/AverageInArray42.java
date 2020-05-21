package javaInterviewQuestions;

public class AverageInArray42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4 };
		// 1. Calculate the mean simple average
		int avg = 0;
		for (int i : arr) {
			avg += i;
		}
		avg /= arr.length;
		System.out.println("Average :: " + avg);
	}

}
