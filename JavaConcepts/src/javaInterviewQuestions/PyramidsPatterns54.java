package javaInterviewQuestions;

public class PyramidsPatterns54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Diamond pattern
		int noOSpaces = 5;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				if (j == 0) {
					for (int j2 = 0; j2 < noOSpaces; j2++) {
						System.out.print(" ");
					}
				}
				System.out.print("* ");
			}
			noOSpaces--;
			System.out.println();
		}
		noOSpaces = 1;
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (j == 0) {
					for (int j2 = 0; j2 < noOSpaces; j2++) {
						System.out.print(" ");
					}
				}
				System.out.print("* ");
			}
			System.out.println();
			noOSpaces++;
		}

		// 2. Triangle Pattern
		noOSpaces = 5;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				if (j == 0) {
					for (int j2 = 0; j2 < noOSpaces; j2++) {
						System.out.print(" ");
					}
				}
				System.out.print("* ");
			}
			System.out.println();
			noOSpaces--;
		}
		System.out.println();

		// 3.Inverted triangle
		noOSpaces = 0;
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (j == 0) {
					for (int j2 = 0; j2 <= noOSpaces; j2++) {
						System.out.print(" ");
					}
				}
				System.out.print("* ");
			}
			System.out.println();
			noOSpaces++;
		}
	}
}
