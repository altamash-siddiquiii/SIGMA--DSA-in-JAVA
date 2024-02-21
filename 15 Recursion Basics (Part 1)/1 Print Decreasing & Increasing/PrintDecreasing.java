public class PrintDecreasing {
    public static void main(String args[]) {

        // PRINT NUMBERS IN DECREASING ORDER (USING RECURSIVE FUNCTION)
        
        int n = 10;

        printDec(n); // call stack in function/method
    }
    public static void printDec(int n) {

        // condition for print to the last number
        if (n == 1) {
            System.out.print(1);
            return; // using else condition, remove return statement 
        }
        System.out.print(n + " ");
            printDec(n-1); // without else by mam
            
        /* else { // This else condition by me
            System.out.print(n + " ");
            printDec(n-1);
        } */
    }
}