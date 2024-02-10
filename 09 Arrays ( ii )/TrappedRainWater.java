import java.util.*;

public class TrappedRainWater {
    public static int trappedRainWater(int height[]) {

        int hl = height.length; // For easy

        // leftMax and rightMax is the helper array (Oxilarry array)
        // Calculate left max boundary - array (start)
        int leftMax[] = new int[hl];

        leftMax[0] = height[0];
        for (int i = 1; i < hl; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calculate right max boundary - array (end)
        int rightMax[] = new int[hl];

        rightMax[hl - 1] = height[hl - 1];
        for (int i = hl - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // Loop to Calculate trappedRainWater
        int trappedWater = 0; // initialize for first time add and then it will increase
        for (int i = 0; i < hl; i++) {
            // waterLevel = min of both (leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String args[]) {

        // Calculate Trapped Rain Water

        // Height of the bars - array
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        // Function call
        System.out.println(trappedRainWater(height));
    }
}