package javaInterviewQuestions;

public class CountVoewlsConsonants50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love harry potter books and movies";
		int cntVowels = 0;
		int cntConso = 0;
		for (int i = 0; i < str.length(); i++) {
			if(isVowelOrConsonant(str.charAt(i))) {
				cntVowels++;
			}else
				cntConso++;
		}
		System.out.println("Vowels count :: "+cntVowels);
		System.out.println("Consonants count :: "+cntConso);
		System.out.println("String length :: "+str.length());
	}

	public static boolean isVowelOrConsonant(char ch) {
		boolean flag = false;
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			flag = true;
		}
		return flag;
	}
}
