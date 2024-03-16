public class Qs2 { // MEDIUM LEVEL QUESTION
    public static void main(String[] args) {
        // Qs 2 : Return  the majority elements from 'n' size of array.
        int nums[] = {3, 3, 2, 3, 2, 2, 3}; // (i) n size of array
        int nums2[] = {2, 3, 2, 1, 1, 1, 2, 3, 2}; // (ii) n size array

        int majorityElmnt = returnMajorityElmnt(nums); // Brute Force Approach
        int majorityElmnt2 = findMajorityElmnt(nums2, 0, nums2.length-1); // Divide & Conquer Approach
        if (majorityElmnt != -1) {
            System.out.println("Majority Element : " + majorityElmnt);
            System.out.println("Majority Element : " + majorityElmnt2);
        } else {
            System.out.println("No Majority Element Found");
        }
    }
    // Approach 1 : Brute Force approach with 0(n^2) TimeComplexity
    static int returnMajorityElmnt(int nums[]) {
        int majorityCount = nums.length / 2;

        for (int i=0; i<nums.length; i++) {
            int count = 0;
            for (int j=0; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count += 1;
                }
            }
            if (count > majorityCount) {
                return nums[i];
            }
        }
        return -1; // No majority element found or element is equal
    }
    // Approach 2 : Divide & Conquer approach with 0(n*log n) TimeComplexity
    static int findMajorityElmnt(int nums2[], int si, int ei) {
        // BaseCase :the only elmnt in an array of size 1 is the majority elmnt
        if (si == ei) {
            return nums2[si];
        }
        // recurse on left and right halves of this slice
        int mid = (ei-si) / 2 + si; // Mid of the array
        int left = findMajorityElmnt(nums2, si, mid); // left part of the array
        int right = findMajorityElmnt(nums2, mid+1, ei); // right part of the array

        // if the two halves agree on the majority elmnt, return it.
        if (left == right) {
            return left;
        }
        // otherwise, count each elmnt and return the "winner".
        int leftCount = countInRange(nums2, left, si, ei);
        int rightCount = countInRange(nums2, right, si, ei);

        return leftCount > rightCount ? left : right;
    }
    static int countInRange(int nums2[], int num, int si, int ei) {
        int count = 0;
        for (int i=si; i<=ei; i++) {
            if (nums2[i] == num) {
                count++;
            }
        }
        return count;
    }
}