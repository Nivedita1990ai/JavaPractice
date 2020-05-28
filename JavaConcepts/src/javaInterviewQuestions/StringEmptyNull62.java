package javaInterviewQuestions;

public class StringEmptyNull62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		if (s == "") {
			System.out.println("Empty string");
		}
		s = null;
		if (s == null) {
			System.out.println("Null string");
		}

		System.out.println(isEmptyOrNull("NULL"));
	}

	// returns true if string is empty or null
	public static boolean isEmptyOrNull(String s) {
		boolean flag = false;
		if (s == null || s.isEmpty()) {
			flag = true;
		}
		return flag;
	}
}
