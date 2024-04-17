public class P9_Fibonacci {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        return fibonacci(n-1) + fibonacci(n-2);
    }
}


// TIME COMPLEXITY OF THIS CODE :-
// twoCalls on everySingleLevel and totalLevel is (n) and work is 1 (const)
// So TC is = (2^n) or TC = O(2^n)

// SPACE COMPLEXITY OF THIS CODE :-
// totalDepth mean totalCalls/Level is (n) and noExtraThings
// So SC = O(n)