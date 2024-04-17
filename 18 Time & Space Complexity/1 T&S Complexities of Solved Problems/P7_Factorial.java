// RECURSION CODE 
public class P7_Factorial {
    public static void main(String[] args) {
        int n = 4;

        System.out.println("Factorial of " + n + " is : " + factorial(n));
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}


// TIME COMPLEXITY OF THIS CODE :- 
// Total Work Done = (no. of calls) * (work in each call) 
// everyTime calling (n-1) and work is const(k)
// total call is = n and work is = k
// So the final TC = O(n) 

// SPACE COMPLEXITY OF THIS CODE :-
// function taking n size space
// not using any extra variable, string, dataStructure, auxillary array or anyother space So it is constant k
// So the final SC = O(n)