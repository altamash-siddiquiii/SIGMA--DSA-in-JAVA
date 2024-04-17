public class P13_PowerFn3 {
    public static void main(String[] args) {
        int n=5, pow=3;

        System.out.println(powerFn3(n, pow));
    }
    public static int powerFn3(int n, int pow) {
        if (pow == 0) {
            return 1;
        }

        int halfPow = powerFn3(n, pow/2);
        int halfPowerSq = halfPow * halfPow;

        if ((pow % 2) != 0) {
            return n * halfPowerSq;
        }
        return halfPowerSq;
    }
}


// TIME COMPLEXITY OF THIS CODE :-
// power divides by 2 recursively until it reaches 0
// making appoximately log base2(n) recursively calls
// So the final TC = O(logn)

// SPACE COMPLEXITY OF THIS CODE :-
// SC depends on the depth of the recursion stack
// since the recursion depth is determined by the number of bits required to represent the n(power)
// So the SC is also = O(logn)