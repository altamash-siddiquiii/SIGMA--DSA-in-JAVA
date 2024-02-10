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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("Number is EVEN");
        } else {
            System.out.println("Number is ODD");
        }
    }
}