package javaInterviewQuestions;

public class CheckIfStringNumeric82 {

	public static void main(String[] args) {

		String num = "23945873as";
		//Regex
		if (num.matches("\\d+")) {
			System.out.println("String numeric");
		} else {
			System.out.println("String not numeric");
		}
		
		//Parse method
		try {
			Double i = Double.parseDouble(num);
			System.out.println("String is numeric***");
		} catch (Exception e) {
			System.out.println("String not numeric");
		}

	}

}
