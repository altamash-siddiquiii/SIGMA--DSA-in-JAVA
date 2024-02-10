import java.lang.reflect.Method;
import java.util.*;

public class JavaFunctions {
    public static void printHloWorld() {
        // Syntax to write Functions
        // body
        System.out.println("Hlo World!");
        System.out.println("Hlo World!");
        return; // Use when void is not written otherwise you can leave it
    }

    public static int calculateSum(int paramtr1, int paramtr2) { // Also called Methods
        int sum = paramtr1 + paramtr2; // paramtr1&2 called parameter or formal paramter
        return sum;
    }

    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + ", b: " + b);
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;

    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // In Binomial Co-efficient, Use factorial function like we used above func
    public static int binCoEff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_NmR = factorial(n - r);
        int binCoEff = fact_n / (fact_r * fact_NmR);
        return binCoEff;
    }

    // Func to calc sum of 2 nmbrs
    public static int sum(int a, int b) {
        return a + b;
    }

    // Func to calc sum of 3 nmbrs
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Func to calc product of two different Data types
    public static int prod(int a, int b) {
        return a * b;
    }

    public static float prod(float a, float b) {
        return a * b;
    }

    public static boolean isPrime(int n) {
        // Corner Cases (for 1 & 2)
        if (n == 2) {
            return true;
        }
        /* boolean isPrime = true; */
        for (int i = 2; i <= (n - 1); i++) {
            if (n % i == 0) {
                /*
                 * isPrime = false;
                 * break;
                 */
                return false;
            }
        }
        /* return isPrime; */
        return true;
    }

    public static boolean checkPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // In Prime Range, Use checkPrime(isPrime) func like we used above func
    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) { // true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void binToDec(int binNum) {
        int myBinNum = binNum;
        int decNum = 0;
        int power = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, power));
            power++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myBinNum +" = "+ decNum);
    }
    public static void decToBin(int decNum) {
        int myDecNum = decNum;
        int binNum = 0;
        int power = 0;
        while (decNum > 0) {
            int remainder = decNum % 2;
            binNum = binNum + (remainder * (int)Math.pow(10, power));
            power++;
            decNum = decNum/2;
        }
        System.out.println("Binary form of "+myDecNum+" = "+binNum);
    }

    public static void main(String[] args) {
        // body
        // printHloWorld(); // Function call
        // Syntax with parameters
        /*
         * Scanner sc = new Scanner(System.in);
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int sum = calculateSum(a, b); // a, b called arguments or actual parameter
         * System.out.println("Sum is: " + sum);
         */

        // Call by Value and Call by Reference
        // swapping (call by value)
        /*
         * int a = 5;
         * int b = 10;
         * swap(a, b);
         */
        /*
         * swapping (call by reference)
         * Agar swap Function se "sysotprt" hata kar yaha aakar likh de to ye amin
         * function ki original value print karega, issi ko call by reference kehte hai
         * System.out.println("a: "+ a + ", b: "+ b);
         */

        // Find product of a & b
        /*
         * int a = 13;
         * int b = 5;
         * int prod = multiply(a, b);
         * System.out.println("a * b = " + prod);
         */

        // Find factorial of a number N
        /* System.out.println(factorial(7)); */

        // Find Binomial Co-Efficient (Used factorial function)
        /* System.out.println(binCoEff(5, 2)); */

        // Function Overloading using parameters
        /*
         * System.out.println(sum(5, 4));
         * System.out.println(sum(2, 4, 3));
         */

        // Overloading using Data types
        /*
         * System.out.println(prod(2, 5));
         * System.out.println(prod(3.1f, 3.23f));
         */

        // Check if a number is prime or not
        /* System.out.println(isPrime(4)); */

        // Check prime number (Optimized case)
        /* System.out.println(checkPrime(4)); */

        // Check prime in a range (Used checkPrime function)
       /*  primeRange(100); */

    //    Convert Binary to Decimal Number
    /* binToDec(111111); */

    // Convert Decimal to Binary Number
   /*  decToBin(11); */

//    Scope - Method scope

// System.out.println(s); // Not allowed
int s = 45; // Below to this variable we can use anywhere but not above 
/* If we declare this variable in a new function and want to print in the main function then
it will give an error */
System.out.println(s); // Allowed

// Scope - Block scope
int a = 21; // We can print this in a block scope
{
    int b = 10;
    System.out.println(b); // Allowed
    System.out.println(a); // We can print a variable in a block bcz they're Globally scoped
}
// System.out.println(b); // Not allowed out of the Currely Bracies mean Block
for (int i=1, j=2, k=3; i<=1; i++) {
    System.out.println(i+j+k); // Allowed jn a block but not allowed out of the block
}
// System.out.println(i+j+k); // Not allowed out of the block

    }
}