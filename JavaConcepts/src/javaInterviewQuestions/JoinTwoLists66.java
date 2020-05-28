package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JoinTwoLists66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = Arrays.asList(new String[] { "test", "cat", "bat", "mat", "stat" });
		List l2 = Arrays.asList(new String[] { "Tom", "Cassie", "Sirius", "Sophie", "Harry" });
		List l3 = new ArrayList<>();
		l3.addAll(l1);
		l3.addAll(l2);
		for (Object object : l3) {
			System.out.println(object);
		}
	}

}
