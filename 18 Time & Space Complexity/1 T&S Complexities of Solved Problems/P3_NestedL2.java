public class P3_NestedL2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=0; i<=n; i++) { // n operations performing
            for (int j=0; j<i; j++) { // j<i = j<=i-1    -> operations
                System.out.print(j + " "); // const work
            }

            System.out.println(); // const work
        }
    }
}


// TIME COMPLEXITY OF THIS CODE IS = (i-1)+(i-1)+(i-1)+......+(i-1)
// TC = (0-1)+(1-1)+(2-1)+.....+(5-1)
// Formula is = n(n-1)/2 = n^2/2-n/2
// So, the final TC = n^2 
// TC = O(n^2)