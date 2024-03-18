import java.util.HashSet;

public class QnA {
    // Qs 1 Method (Solution)
    // Approach 1 : Brute Force with 0(n^2) TimeComplexity
    public static boolean containsDuplicate(int nums[]) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    // Approach 2 : using Sets (HashSet) with 0(n) TimeComplexity
    public static boolean containsDuplicate2(int nums[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
    // Qs 2 Method (Solution)
    public static int search(int[] nums, int start, int end, int tar) {
        int si=start, ei=end;

        while (si <= ei) { // startingIndex to endingIndex
            int mid = si+(ei-si) / 2; // firstly calculate mid

            if (nums[mid] == tar) { // mid is equal to target, return it
                return mid;
            }
            else if (nums[mid] > tar) { // if mid is greater then decrease one by one
                ei = mid - 1;
            }
            else { // if mid is smaller then increase one by one
                si = mid + 1;
            }
        }
        return -1; // not found, return invalid number
    }
    public static int minSearch(int[] nums) {
        int si = 0;
        int ei = nums.length - 1;

        while (si < ei) {
            int mid = si+(ei-si) / 2;

            if (mid > 0 && nums[mid-1] > nums[mid]) {
                return mid;
            }
            else if (nums[si] <= nums[mid] && nums[mid] > nums[ei]) {
                si = mid + 1;
            }
            else {
                ei = mid - 1;
            }
        }
        return si;
    }
    public static int search(int[] nums, int tar) {
        // min will have index of minimum element of nums
        int min = minSearch(nums);

        // find in sorted left
        if (nums[min] <= tar && tar <= nums[nums.length-1]) {
            return search(nums, min, nums.length-1, tar);
        }
        // find in sorted right
        else {
            return search(nums, 0, min, tar);
        }
    }
    // Qs 3 Method (Solution)
    public static int maxProfit(int prices[]) {
        int buy = prices[0]; // first day buy price
        int profit = 0; // first day profit

        for (int i=1; i<prices.length; i++) {
            if (buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }
    public static int trappedWater(int[] height) {
        int res = 0, left = 0, right = height.length-1;
        int leftMax = height[left], rightMax = height[right];
        while (left < right) {
        if (leftMax < rightMax) {
        left++;
        leftMax = Math.max(leftMax, height[left]);
        res += leftMax - height[left];
        } else {
        right--;
        rightMax = Math.max(rightMax, height[right]);
        res += rightMax - height[right];
          }
        }
        return res;
        }
    public static void main(String[] args) {
        // Qs 1 : Solution
        /* int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate2(nums)); */

        // Qs 2 : Solution
        /* int nums[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 0)); */

        // Qs 3 : Solution
        /* int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); */

        // Qs 4 : Solution
        /* int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedWater(height)); */
    }
}