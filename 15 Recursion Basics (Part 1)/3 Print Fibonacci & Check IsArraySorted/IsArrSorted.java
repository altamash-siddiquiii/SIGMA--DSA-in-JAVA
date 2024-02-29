public class IsArrSorted { 

    public static void main(String args[]) {

        // CHECK IF AN ARRAY IS SORTED OR NOT
        int array[] = {1, 2, 3, 6, 5};

        boolean isSorted = isSorted(array, 0);
        if (isSorted) {
            System.out.println("Array is SORTED.");
        } else {
            System.out.println("Array is NOT SORTED.");
        }
    }
    public static boolean isSorted(int array[], int i) {

        if (i == array.length-1) { // Base Case
            return true;
        }
        if (array[i] > array[i+1]) {
            return false;
        }
        return isSorted(array, i+1);
    }
}