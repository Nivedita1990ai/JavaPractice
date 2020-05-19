package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 9, 6, 8, 4, 0, 5, 2, 7, 3, 1 };
		Arrays.sort(arr);
		List<Integer> list = Arrays.asList(arr);
		Collections.reverse(list);
		for(int i:list) {
			System.out.println(i+" ");
		}
		System.out.println(list);
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "aug", "Sep", "Oct", "nov", "Dec" };

		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
		for (int i = 0; i < inputList.length; i++) {
			System.out.println(inputList[i]);
		}

	}

}
