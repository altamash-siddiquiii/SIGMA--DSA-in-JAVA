public class P12_PowerFn2 {

    public static void main(String[] args) {
        int n=5, pow=3;

        System.out.println(powerFn2(n, pow));
    }
    public static int powerFn2(int n, int pow) {
        if (pow == 0) {
            return 1;
        }

        int halfPowSq = powerFn2(n, pow/2) * powerFn2(n, pow/2);

        if ((pow % 2) != 0) { // for ODD cases
            return n * halfPowSq;
        }
        return halfPowSq; // for EVEN cases
    }
}


// TIME COMPLEXITY OF THIS CODE :-
// TC of this code = O(n)

// SPACE COMPLEXITY OF THIS CODE :-
// SC is also = O(n)