public class Qs1 { // EASY LEVEL QUESTION
    public static void main(String[] args) {
        // Qs 1 : Apply merge sort to sort an array of Strings
        String arr[] = {"sun", "earth", "mars", "moon"}; // string  array

        sort(arr, 0, arr.length-1); // function call
        for (String a : arr) { // print the sorted array
            System.out.print(a + " ");
        }
    }
    static void sort(String arr[], int si, int ei) {
        if (si >= ei) { // Base case
            return;
        }
        int mid = si+(ei-si) / 2; // Mid part of the array
        sort(arr, si, mid); // left part of the array
        sort(arr, mid+1, ei); // right part of the array

        merge(arr, si, mid, ei); // to merge the array
    }
    static void merge(String arr[], int si, int mid, int ei) {
        String tempA[] = new String[ei-si+1]; // Temporary array

        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for tempA

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) { // comparing values
                tempA[k++] = arr[i++];
            } else {
                tempA[k++] = arr[j++];
            }
        }
        // copy the remaining elmnts
        while (i <= mid) {
            tempA[k++] = arr[i++];
        }
        while (j <= ei) {
            tempA[k++] = arr[j++];
        }
        // copy the elmnts from temp array to original array
        for (k=0, i=si; k<tempA.length; k++, i++) {
            arr[i] = tempA[k]; 
        }
    }
}


/* MAM's SOLUTION FOR THE SAME PROBLEM */

// public class Qs1 {
//     // function to mergeSort 2 arrays
//     public static String[] mergeSort(String[] arr, int lo, int hi) {
//         if (lo == hi) {
//             String[] A = { arr[lo] };
//             return A;
//         }
//         int mid = lo + (hi - lo) / 2;
//         String[] arr1 = mergeSort(arr, lo, mid);
//         String[] arr2 = mergeSort(arr, mid + 1, hi);
//         String[] arr3 = merge(arr1, arr2);
//         return arr3;
//     }
//     static String[] merge(String[] arr1, String[] arr2) {
//         int m = arr1.length;
//         int n = arr2.length;
//         String[] arr3 = new String[m + n];
//         int idx = 0;
//         int i = 0;
//         int j = 0;
//         while (i < m && j < n) {
//             if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
//                 arr3[idx] = arr1[i];
//                 i++;
//                 idx++;
//             } else {
//                 arr3[idx] = arr2[j];
//                 j++;
//                 idx++;
//             }
//         }
//         while (i < m) {
//             arr3[idx] = arr1[i];
//             i++;
//             idx++;
//         }
//         while (j < n) {
//             arr3[idx] = arr2[j];
//             j++;
//             idx++;
//         }
//         return arr3;
//     }

//     // Return true if str1 appears before str2 in alphabetical order
//     static boolean isAlphabeticallySmaller(String str1, String str2) {
//         if (str1.compareTo(str2) < 0) {
//             return true;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         String[] arr = { "sun", "earth", "mars", "mercury" };
//         String[] a = mergeSort(arr, 0, arr.length - 1);
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }