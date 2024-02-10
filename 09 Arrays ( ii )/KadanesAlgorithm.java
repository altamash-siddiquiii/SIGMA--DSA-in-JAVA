import java.util.*;

public class KadanesAlgorithm {
    public static void kadanesAlgo(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];

            if (currSum < 0) {
                currSum = 0;
            }
            // Who is big, they will store in maxSum with the help of this Math.max( , );
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum Sum : " + maxSum);
    }

    public static void kadaneSmallest(int num[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            cs += num[i]; // cs+num[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);

            // For smallest value
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.print("Smallest value : " + smallest + ", ");
        System.out.println("Max sum : " + ms);
    }

    public static void main(String args[]) {

        // (iii) Print Maximum Subarray Sum - Kadane's Algorithm
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int num[] = { -1, -2, +3, -4, -5, };

        kadanesAlgo(numbers);
        kadaneSmallest(num);

        // Time Complexity is Big of n
    }
}