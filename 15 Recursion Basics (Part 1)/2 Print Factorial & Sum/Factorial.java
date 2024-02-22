public class Factorial {
    public static void main(String[] args) {
        
        // PRINT FACTORIAL OF A NUMBER
        int n = 5;

        System.out.println(printFactorial(n));
    }
    public static int printFactorial(int n) {

        if (n == 0) { // BASE CASE OF RECURSION
            return 1;
        } // This condition is imp to know when calc the factorial of a num n

        int fN_1 = printFactorial(n - 1);
        int fN = n * fN_1;

        return fN;
    }
}