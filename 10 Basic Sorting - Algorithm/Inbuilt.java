// import java.util.*; // All of util in this (*)
import java.util.Arrays; // It is especially for Sorting(IncreasingOrder), Use without (*)
import java.util.Collections; // Its for sorting (DecreasingOrder)

public class Inbuilt {
    public static void printArray(Integer array[]) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {

        // Inbuilt Sorting in Java
        // int array[] = { 2, 5, 3, 1, 4 }; // for IncreasingOrder
        Integer array[] = { 2, 5, 3, 1, 4 }; // for DecreasingOrder

        // for sorting (Ascending || Increasing Order) - Using import
        // Arrays.sort(array); // sort from start to end
        Arrays.sort(array, 0, 3); // sort from given index to given last index

        // for sorting (Descending || Decreasing Order)
        // Arrays.sort(array, Collections.reverseOrder()); // sort from start to end (all)
        Arrays.sort(array, 0, 3, Collections.reverseOrder()); // sort from given index to given last index
        // for print using function
        printArray(array);
    }
}