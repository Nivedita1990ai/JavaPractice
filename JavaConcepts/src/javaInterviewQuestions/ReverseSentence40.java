package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseSentence40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I love Harry Potter books and movies";
		// by Array
		String[] words = s.split(" ");
		String reversedStr = "";
		for (int i = words.length - 1; i >= 0; i--) {
			reversedStr = reversedStr.concat(words[i] + " ");
		}
		System.out.println("Reversed sentence :: " + reversedStr);

		// by List
		List<String> wrds = Arrays.asList(s.split(" "));
		reversedStr = "";
		for (int i = wrds.size() - 1; i >= 0; i--) {
			reversedStr = reversedStr.concat(wrds.get(i) + " ");
		}
		System.out.println("Reversed String by List : " + reversedStr);

	}

}
