import java.util.*;
public class QnA {
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    public static boolean isEven(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNum = 0;
        
        while (num != 0) {
            int remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num = num / 10;
        }
        // if original number and reverse number is equal or not
        if (originalNum == reverseNum) {
            return true;
        } else {
            return false;
        }
    }
    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        // Question 1 and His Solution
       /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer value : ");
        double a = sc.nextDouble();
        System.out.print("Enter second integer value : ");
        double b = sc.nextDouble();
        System.out.print("Enter third integer value : ");
        double c = sc.nextDouble();

        System.out.println("Average is : " + average(a, b, c));

        // Without input
        int  x = 11, y = 15, z = 4;
        int averageIs = (x + y + z) / 3;
        System.out.println("Average of integers is : " + averageIs); */

        // Question 2 and His Solution
        /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("Number is EVEN");
        } else {
            System.out.println("Number is ODD");
        } */

        // Question 3 and His Solution
        /* System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int palindromeNum = sc.nextInt();
        if (isPalindrome(palindromeNum)) {
            System.out.println(palindromeNum + " is a Palindrome");
        } else {
            System.out.println(palindromeNum + " is not a Palindrome");
        } */

        // Question 4 and His Solution
        /* READ AND CODE EXERCISE
        * Search about (on Google) & use the following methods of the Math class in Java:
        * (i) Math.min( ) (ii) Math.max( ) (iii) Math.sqrt( )
        * (iv) Math.pow( ) (v) Math.avg( ) (vi) Math.abs( )
        * Free reading resource ( https://www.javatpoint.com/java-math )  */

        // Question 5 and His Solution
        int sod = sumOfDigits(456);
        System.out.println("Sum of Digits : " + sod);
    }
}