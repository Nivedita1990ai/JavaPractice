package javaInterviewQuestions;

public class StandardDeviation45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4 };
		// 1. Calculate the mean simple average
		int mean = 0;
		for (int i : arr) {
			mean += i;
		}
		mean /= arr.length;
		System.out.println("Mean :: " + mean);
		// 2. Then for each number: subtract the Mean and square the result
		double mean2 = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Math.pow((arr[i] - mean), 2));
			mean2 += Math.pow((arr[i] - mean), 2);
		}
		//3. Mean of squared differences
		mean2 /= arr.length;
		System.out.println(mean2);

		double stdDev = Math.sqrt(mean2);
		System.out.println("Standard deviation :: " + stdDev);
	}

}
