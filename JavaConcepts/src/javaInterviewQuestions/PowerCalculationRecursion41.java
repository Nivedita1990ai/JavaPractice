import java.util.Scanner;

public class PowerCalculationRecursion41 {
    public static void main(String[] args) {
        System.out.println("Enter the number :: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the power :: ");
        int p = scan.nextInt();
        scan.close();
        long pow = 0;
        if (n > 0 && p > 0) {
            pow = power(n, p);
            System.out.println("Power :: "+pow);
        } else {
            System.out.println("Invalid Input !!!");
        }
    }

    private static long power(int n, int p) {
        if(p!=0) {
            return (n * power(n, p - 1));
        }else{
            return 1;
        }
    }
}
