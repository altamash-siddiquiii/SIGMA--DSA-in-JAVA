import java.util.*;
public class JavaLoops {
    public static void main(String args[]) {

        // While Loops 
      /*  int counter = 0;
        while (counter<5) {
            System.out.println("Hlw World!");
            counter++;
        } */

        // Print a number from 1 to 10
      /*  int counter = 1;
        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        } */ 

        // Print a number from 1 to N  
       /* Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        } */

        // Print wum of first N natural numbers
      /*  Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.print("sum is: " + sum); */

        // For Loops
      /*  for (int i = 1; i<=5; i++) {
            System.out.println("HlW World!");
        } */

        // Print square pattern
      /*  for (int i = 1; i<=4; i++) {
            System.out.println("****");
        } */
      /*  int line = 1;
        while (line <= 4) {
            System.out.println("****");
            line++;
        } */

        // Print reverse of a number
      /*  int number = 10899;
        while (number > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number /= 10;
        } */

        // Print reverse of the given number
      /*  int number = 19032004;
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        System.out.print(reverse); */

        // Do-While Loops
      /*  int counter = 1;
        do {
            System.out.println("Hlw World!");
            counter++;
        } while (counter < 5); */

        // Break Statement in Loops
       /* for (int i = 1; i<=5; i++) {
            if (i==3) {
                break;
            }
            System.out.println(i);
        }
        System.out.print("I am out of the loop."); */

        // Keep entering a number till user enters a multiple of 10
      /*  Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true); */

        // Continue Statement
       /* for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        } */

        // Display all numbers entered by user except multiple of 10 (Based on C.S.)
       /* Scanner sc = new Scanner(System.in);
        do {
          System.out.print("Enter your number: ");
          int n = sc.nextInt();
          if (n%10==0) {
            continue;
          }
          System.out.println("Your number was: " + n);
        } while (true); */

        // Check if a number is Prime or Not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n==2) {
          System.out.print(n + " is a prime number.");
        } else {
        boolean isPrime = true;
          for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n%i==0) { // n is a multiple of i (i is not rqual to 1 or n)
              isPrime = false;
            }
          }
          if (isPrime == true) {
            System.out.print(n + " is a prime number.");
          } else {
            System.out.print(n + " is not a prime number (composite number).");
          }
        }
    }
}