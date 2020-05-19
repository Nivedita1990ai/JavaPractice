package test;

public class CheckPrime {

	public static void main(String[] args) {
		int num = 25;
		if (checkPrime(num)) {
			System.out.println("Input value " + num + " is a prime number.");
		} else {
			System.out.println("Input value " + num + " is not a prime number.");
		}
		for (int i = 2; i < 100; i++) {
			if (checkPrime(i)) {
				System.out.print(i+" ,");
			}
		}
	}

	public static boolean checkPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num/2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
