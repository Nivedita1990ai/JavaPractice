package javaInterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortInAlphabeticalOrder51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List strList = Arrays.asList(new String[] { "000","abc","3DS","4k","Nap", "Cat", "Oil", "Man", "XXX", "Bat", "Apple" });
		Collections.sort(strList,String.CASE_INSENSITIVE_ORDER);
		for (Object str : strList) {
			System.out.println(str);
		}
	}
}
