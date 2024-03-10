public class Prblm13_FrndsPairing {
    public static void main(String[] args) {
        /* Problem 13 : Friends Pairing Problem
        Given n friends, each one can remain single or can be paired up with some other friend,
        Each friend can be paired only once.
        Find out the total number of ways in which friends can remain single or can be paired up.*/
        int n = 5; // Total n friends
        System.out.println("Total Ways : " + friendsPairing(n));
    }
    public static int friendsPairing(int n) {
        // Base Case : if they stands single or two friends with each-other
        if (n == 1 || n == 2) {
            return n;
        }
        /* For easy understanding
        // Choice : (i) Stand single
        int fN_1 = friendsPairing(n-1);
        // Pair : (ii) Stand with other friend
        int fN_2 = friendsPairing(n-2);
        int pairWays = (n-1) * fN_2;
        // Total Pairs : Choice + Pair
        int totalWays = fN_1 + pairWays;
        // Return totalWays to main method
        return totalWays; */
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
}