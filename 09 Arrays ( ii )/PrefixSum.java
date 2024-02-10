import java.util.*;

public class PrefixSum {
public static void printMaxSubarraySum(int numbers[]) {
    int currSum = 0; // initialize
    int maxSum = Integer.MIN_VALUE;

    // Calculate Prefix - array
    int prefix[] = new int[numbers.length];

    prefix[0] = numbers[0];
    for (int i=1; i<prefix.length; i++) {
        prefix[i] = numbers[i] + prefix[i-1];
    }
    for (int i=0; i<numbers.length; i++) {
        int start = i;
        for (int j=i; j<numbers.length; j++) {
            int end = j;

            currSum = (start == 0)? prefix[end] : prefix[end] - prefix[start - 1];
        }
        if (maxSum < currSum) {
            maxSum = currSum;
        }
    }
    System.out.println("Maximum Sum : " + maxSum);
}
    public static void main(String[] args) {

        // (ii) Maximum SubArray Sum - Prefix Sum

        int numbers[] = { 1, -2, 6, -1, 3 };

        printMaxSubarraySum(numbers);

        // Time Complexity is = Big of (n)^square
    }
}