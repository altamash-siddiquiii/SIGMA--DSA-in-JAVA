public class SR_ArrSearch {
    public static void main(String[] args) {
        // Sorted & Rotated Array Search - Search in Rotated Sorted Array
        /* Input : sorted, rotated array with distinct numbers (in ascending order)
        * It is rotated at a pivot point.
        * Find the index of given element. */
        int  arr[] = {3, 4, 5, 0, 1, 2};
        int target = 0;

        int ti = search(arr, target, 0, arr.length-1);
        System.out.println("Target found at index : " + ti);
    }
    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1; // Not found
        }
        int mid = si+(ei-si) / 2; // si+ei/2

        if (arr[mid] == tar) { // found on mid
            return mid;
        }
        // when mid on line 1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                // case a : left
                return search(arr, tar, si, mid-1);
            } else {
                // case b : right
                return search(arr, tar, mid+1, ei);
            }
        }
        // when mid on line 2
        else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                // case c : right
                return search(arr, tar, mid+1, ei);
            } else {
                // case d : left
                return search(arr, tar, si, mid-1);
            }
        }
    }
}