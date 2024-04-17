public class P8_sum {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(sumOfInts(n));
    }
    public static int sumOfInts(int n) {
        if (n == 0) {
            return 0;
        }
        
        return n + sumOfInts(n-1);
    }
}


// TIME COMPLEXITY OF THIS CODE :-
// Operations performing(everyTimeFnCall) : n to (n-1)
// Work performing(everTimeFnCall) : k(constant)
// So they will be : n * k or (n-1) * k
// After the ignoring constant work : n
// So the final TC = O(n)
// and
// SPACE COMPLEXITY :-
// No any extra space usaging like : variables, auxiArr or anyThing
// So the SC will also = O(n)