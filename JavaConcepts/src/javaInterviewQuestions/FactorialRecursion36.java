import java.util.Scanner;

public class FactorialRecursion36 {
    public static void main(String[] args) {
        System.out.println("Enter the number for factorial :: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        long fact = factorial(n);;
        if (fact == -1) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Factorial :: "+fact);
        }

    }

    private static long factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return n * factorial(n - 1);
        }

    }
}
