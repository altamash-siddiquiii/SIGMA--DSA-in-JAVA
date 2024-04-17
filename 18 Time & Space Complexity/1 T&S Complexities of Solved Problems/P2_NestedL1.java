public class P2_NestedL1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=0; i<=n; i++) { // n operations
            for (int j=i+1; j<n; j++) { // j<n == j<=n-1    -> n eperations
                System.out.print(j + " "); // k constant work
            }
            System.out.println(); // k const work
        }
    }
}


// TIME COPLEXITY OF THIS CODE IS = (n-1)+(n-2)+(n-3).....
// So, formula is = n(n-1) / 2; where we ignoring constant work
// formula = n^2/2 - n/2
// Now largest term is = n^2
// So, the final TC = O(n^2)