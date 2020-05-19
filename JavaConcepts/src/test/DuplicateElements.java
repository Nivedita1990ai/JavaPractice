package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		Integer[] arr = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 7, 8, 9 };
		List<Integer> list = Arrays.asList(arr);
		Set<Integer> duplicates = new HashSet<Integer>()  ;
		Set<Integer> result = new HashSet<Integer>();
		for (int i:list) {
			if (!duplicates.add(i)) {
				result.add(i);
			}
		}
		System.out.println(result);
	}

}
