package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTOArrayViceversa67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[] { "test", "cat", "bat", "mat", "stat" };

		List<String> a = new ArrayList<String>();
		a = Arrays.asList(s);

		String[] s1= new String[a.size()]; 
		a.toArray(s1);
		for (String string : a) {
			System.out.println("ArrayList string :: "+string);
		}
		
		for (String string : s1) {
			System.out.println("Str array : "+string);
		}
	}

}
