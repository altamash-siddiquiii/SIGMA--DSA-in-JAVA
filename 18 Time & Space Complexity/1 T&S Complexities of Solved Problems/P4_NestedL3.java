public class P4_NestedL3 {
    public static void main(String[] args) {
        int n = 25, k = 5;
        for (int i=0; i<=n; i+=k) {
            for (int j=0; j<=k; j++) {
                System.out.print(j + " "); // constant work
            }
            System.out.println(); // const work
        }
    }
}


// TIME COMPLEXITY OF THIS CODE IS = (n/k) = 25/5
// Formula = n/2 * constWork = n/k * constWork
// So, final TC = n       -> after ignoring the constantWork
// TC = O(n)