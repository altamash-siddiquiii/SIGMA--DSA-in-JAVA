public class Prblm4 {
    public static void main(String[] args) {
        // Problem 5 : Check if an array is SORTED or NOT SORTED (Strictly increasing)
        int array[] = {1, 2, 3, 4, 4};
        int arr[] = {1, 2, 3, 4, 5};

        boolean isSorted = isSorted(array, 0);
        if (isSorted) {
            System.out.println("The array is SORTED.");
        } else {
            System.out.println("The array is NOT SORTED.");
        }
        System.out.println(isSortedd(arr, 0));
    }
    public static boolean isSorted(int array[], int i) {
        if (i == array.length-1) {
            return true;
        }
        if (array[i] >= array[i+1]) {
            return false;
        }
        return isSorted(array, i+1);
    }
    public static boolean isSortedd(int arr[], int i) {
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] < arr[i+1]) {
            // Sorted till now
            return isSortedd(arr, i+1);
        } else {
            // Not sorted
            return false;
        }
    }
}