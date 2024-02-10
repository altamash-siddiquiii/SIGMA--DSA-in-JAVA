import java.util.*;
public class QnA {
    public static void main(String args[]) {

        // Question 1 and His Solution
      /*  for (int i = 1; i<8; i++) {
            System.out.println("Hellow");
            i+=2;
        } */
      /*  int i = 1;
        while (i < 5) {
            System.out.println("Hlw");
            i++; i+=2;
        } */

        // Question 2 and His Solution
       /* Scanner sc = new Scanner(System.in);
        int nmbr;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter a number: ");
            nmbr = sc.nextInt();
            if (nmbr%2==0) {
                evenSum += nmbr;
            } else {
                oddSum += nmbr;
            }
            System.out.print("Do you want to continue for more input? Press 1 for Yes or press any key for No : ");
            choice = sc.nextInt();
        } while (choice==1);
        System.out.print("Sum of even numbers : " + evenSum);
        System.out.print("Sum of odd numbers : " + oddSum); */

        // Question 3 and His Solution
        Scanner sc = new Scanner(System.in);
        int nmbr; // To hold number
        int factorial = 1; // To hold factorial value
        System.out.print("Enter any positive integer: ");
        nmbr = sc.nextInt();
            for (int i=1; i<=nmbr; i++) {
            factorial *= i;
        } System.out.print("Factorial: " + factorial);

        // Question 4 and His Solution
      /*  do {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i=1; i<=10; i++) {
            int ans = n*i;
            System.out.println(n + "*" + i + " = " + ans);
        }
        } while (true); */

        // Question 5 and His Solution
    //    int i; // This "int i" is missing in this program and remove "int" from the loop.
       /* for (int i=0; i<=5; i++) {
            System.out.println("i = " + i);
        } */
    }
}