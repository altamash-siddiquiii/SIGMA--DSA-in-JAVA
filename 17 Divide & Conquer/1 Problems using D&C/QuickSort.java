public class QuickSort {
    public static void main(String[] args) {
        // Quick Sort - Pivot & Partition
        int arr[] = {-1, 2, -3, 4, -5, 0, 5, -4, 3, -2, 1};

        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pivI = partition(arr, si, ei); // for pivot index
        quickSort(arr, si, pivI-1); // for left part
        quickSort(arr, pivI+1, ei); // for right part
    }
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // last elmnt is my pivot

        int i = si-1; // to make place for elmnts which is smaller than pivot
        for (int j=si; j<ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; /* Cannot write "pivot=arr[i]", Bcz "pivot" is a variable and variables does'nt reflect in functions due to "Call by value". "Call by reference indirectly implements in java (java mean only in Arrays & Objects)." */
        arr[i] = temp;

        return i;
    }
    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}