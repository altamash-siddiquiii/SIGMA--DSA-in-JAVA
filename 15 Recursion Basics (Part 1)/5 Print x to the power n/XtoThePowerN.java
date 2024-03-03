public class XtoThePowerN {
    public static void main(String[] args) {
        
        // Print X to the power n (X^n)
        System.out.println(calcX2thePowerN(2, 3));
    }
    public static int calcX2thePowerN(int x, int n) {

        if (n == 0) { // BaseCase
            return 1;
        }
        /* For understanding to see this code
        int xN_1 = calcX2thePowerN(x, n-1);
        int xN = x * xN_1;
        return xN; */
        return x * calcX2thePowerN(x, n-1);
    }
}