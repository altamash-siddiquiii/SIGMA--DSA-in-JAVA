import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        // PRINT Nth FIBONACCI NUMBER
        /* int n = 6;

        System.out.println(printFibonacci(n)); */

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int m = sc.nextInt();
        System.out.println("Fibonacci of " + m + " is: " + printFibo(m));
        } // Press "Ctrl + C" to STOP the Program.
    }
    public static int printFibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int fN_1 = printFibonacci(n - 1);
        int fN_2 = printFibonacci(n - 2);
        int fN = fN_1 + fN_2;

        return fN;
    }
    public static int printFibo(int m) {

        if (m == 0 || m == 1) {
            return m;
        }
        return printFibo(m - 1) + printFibo(m - 2);
    }
}