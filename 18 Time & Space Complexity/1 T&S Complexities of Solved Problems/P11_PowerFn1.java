public class P11_PowerFn1 {
    public static void main(String[] args) {
        int n=5, pow=3; // 'n' to the power 'pow'

        System.out.println(powerFn1(n, pow));
    }
    public static int powerFn1(int n, int pow) {
        if (pow == 0) {
            return 1;
        }

        return n * powerFn1(n, pow-1);
    }
}


// TIME COMPLEXITY OF THIS CODE :-
// Total work done = No. of calls * Time in each calls = n * k(constantWork)
// so the final TC = O(n)

// SPACE COMPLEXITY OF THIS CODE :-
// SC of this code is also = O(n)
// because for each recursive call, additional space is allocated on the call stack
// to store the function call, parameters, and local variables until the base case is reached