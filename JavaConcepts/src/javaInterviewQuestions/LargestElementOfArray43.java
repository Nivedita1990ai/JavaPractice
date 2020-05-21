package javaInterviewQuestions;

import java.util.Arrays;

public class LargestElementOfArray43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4 };
		// Using Arrays.sort
		Arrays.sort(arr);
		System.out.println("Largest element :: "+arr[arr.length-1]);
		
		//Using for loop
		int largest = 0;
		for (int i = 0; i < arr.length-1; i++) {
			largest = arr[i];
			if(largest < arr[i+1]) {
				largest=arr[i+1];
			}
		}
		
		System.out.println("Largest no by for loop :: "+largest);
	}

}
