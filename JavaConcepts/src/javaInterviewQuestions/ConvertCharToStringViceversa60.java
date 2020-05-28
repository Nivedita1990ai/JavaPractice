package javaInterviewQuestions;

public class ConvertCharToStringViceversa60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Nivedita";
		char[] ch=stringToChar(s);
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println(charToString(ch));

	}

	public static char[] stringToChar(String s) {
		return s.toCharArray();
	}

	public static String charToString(char[] ch) {
		String s = "";
		for (int i = 0; i < ch.length; i++) {
			s = s + ch[i];
		}
		return s;
	}

}
