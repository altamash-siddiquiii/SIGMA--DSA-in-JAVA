public class Qs4 {
    public static void main(String[] args) {
        // Qs 4 : Find the Count of Contiguous Substrings starting and ending with the same character.
        // Sample 1
        String S = "abcab";
        int n = S.length();
        int count = countContiguousSubstrs(S, 0, n-1, n);
        System.out.println("Count of Substring : " + count);

        // Sample 2
        String str = "aba";
        int sL = str.length();
        int countt = countContiguousSubstrs(str, 0, sL-1, sL);
        System.out.println("Count of Substrings : " + countt);
    }
    public static int countContiguousSubstrs(String S, int sI, int eI, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countContiguousSubstrs(S, sI+1, eI, n-1) +
                    countContiguousSubstrs(S, sI, eI-1, n-1) -
                    countContiguousSubstrs(S, sI+1, eI-1, n-2);
        if (S.charAt(sI) == S.charAt(eI)) {
            res++;
        }
        return res;
    }
    // public static int countContiguousSubstrings(String str, int sI, int eI, int sL) {
    //     if (sL == 0) {
    //         return 0;
    //     }
    //     int res = countContiguousSubstrings(str, sI+1, eI, sL-1) +
    //             countContiguousSubstrings(str, sI, eI-1, sL-1) -
    //             countContiguousSubstrings(str, sI+1, eI-1, sL-2);

    //     if (str.charAt(sI) == str.charAt(eI)) {
    //         res++;
    //     }
    //     return res;
    // }
}