import java.util.*;

public class BruteForce {
    public static void printMaxSubarraySum(int numbers[]) {
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) { // print loop
                    // SubArray Sum
                    currentSum += numbers[k];
                }
                System.out.print(currentSum + " "); // print each sum
                if (maximumSum < currentSum) {
                    maximumSum = currentSum;
                }
            }
            System.out.println();
        }
        // Print Max Sum of SubArray
        System.out.println("Maximum Sum : " + maximumSum);
    }

    public static void main(String args[]) {

        // (i) Print Maximum Subarray Sum - Brute Force

        int numbers[] = { 2, 4, 6, 8, 10 };
        // int numbers[] = { 1, -2, 6, -1, 3 };

        printMaxSubarraySum(numbers);

        // Time Complexity is = Big of (n)^cube
    }
}