public class Prblm11_Tiling {
    public static void main(String[] args) {
        
        /* Problem 11 : Tiling Problem
        Given a (2 x N) board and tiles of sizes (2 x 1), count the number of ways to tile the given board using the 2 x 1 tiles.
        (A tile can either be placed horizontally or vertically.) */
        System.out.println("Total Number of Ways : " + tilingProblem(4));
    }
    public static int tilingProblem(int n) {
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        /* // For vertically
        int fN_1 = tilingProblem(n-1); // for N minus 1 (fN_1)
        // For Horizontally
        int fN_2 = tilingProblem(n-2);
        // Total ways
        int totalWays = fN_1 + fN_2;

        return totalWays; */

        // For both Horizontally and Vertically
        return tilingProblem(n-1) + tilingProblem(n-2);
    }
}