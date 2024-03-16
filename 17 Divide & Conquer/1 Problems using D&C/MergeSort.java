public class MergeSort {
    public static void main(String[] args) {
        // Merge Sort - Divide & Conquer
        int arr[] = {1, -3, 2, -4, -2, 4, 5, 3, -1, 0, -5};

        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si+(ei-si) / 2; // si+ei/2

        mergeSort(arr, si, mid); // left part of the array
        mergeSort(arr, mid+1, ei); // right part of the array

        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        int tempArr[] = new int[ei- si+1]; // tempArrSize=6-0+1=7=originalArrSize

        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                tempArr[k] = arr[i];
                i++;
            } else {
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }
        // copy the remaining elements
        while (i <= mid) { // left part
            tempArr[k++] = arr[i++];
        }
        while (j <= ei) { // right part
            tempArr[k++] = arr[j++];
        }
        for (k=0, i=si; k<tempArr.length; k++, i++) {
            arr[i] = tempArr[k];
        }
    }
    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}