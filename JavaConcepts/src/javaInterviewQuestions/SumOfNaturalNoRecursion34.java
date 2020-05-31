import java.util.Scanner;

public class SumOfNaturalNoRecursion34 {
    public static void main(String[] args) {
        System.out.println("Enter the number :: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int sum = 0;
        if (n >= 0) {
            sum = sum(n);
            System.out.println("Sum :: "+sum);
        } else {
            System.out.println("Invalid input!!!");
        }
    }

    private static int sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
        } else
            return 0;
    }
}
