package javaInterviewQuestions;

public class VowelOrConsonants8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'd';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Alphabet is vowel");
		} else {
			System.out.println("Alphabet is consonant");
		}

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Alphabet is vowel");
			break;

		default:
			System.out.println("Alphabet is consonant");
		}
	}

}
