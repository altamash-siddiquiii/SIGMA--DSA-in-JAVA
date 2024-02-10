import java.util.*;
public class Arrays {
    public static void update(int marks[], int nonChangable) {
        nonChangable = 10;
        for (int i=0; i<marks.length; i++) {
            marks[i] += 1;
        }
    }
    public static int linearSearch(int numbers[], int key) {
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int findLargest(int nmbrs[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i=0; i<nmbrs.length; i++) {
            if (largest < nmbrs[i]) {
                largest = nmbrs[i];
            }
        }
        // findSmallest in findLargest function
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i=0; i<nmbrs.length; i++) {
            if (smallest > nmbrs[i]) {
                smallest = nmbrs[i];
            }
        }
        System.out.println("Smallest Value is : " + smallest);
        return largest;
    }
    public static int binarySearch(int n[], int keySearch) {
        int start = 0, end = n.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2; // middle part found
            // Comparison
            if (n[middle] == keySearch) {
                return middle;
            }
            if (n[middle] < keySearch) { // right part
                start = middle + 1;
            }
            else { // if (n[middle] > keySearch) - left part
                end = middle - 1;
            }
        }
        return -1;
    }
    public static void reverseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            // swapping - call by stack(reference) in Array
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++; last--;
        }
    }
    public static void pairs(int numbers[]) {
        int tp = 0;
        for (int i=0; i<numbers.length; i++) {
            // int current = numbers[i];   // (Mam)
            for (int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ")"); // without current variable (Me)
                // System.out.print("(" + current + ", " + numbers[j] + ")");   // linked with current variable (Mam)
                tp++; // tp = n*(n-1)/2;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = " + tp);
    }
    public static void printSubArray(int numbers[]) {
        int ts = 0;
        for (int i=0; i<numbers.length; i++) {
            int start = i;
            for (int j=i; j<numbers.length; j++) {
                int end = j;
                for (int k=start; k<=end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray = " + ts); // ts=n*(n+1)/2;
    }
    public static void main(String[] args) {
        // Creating an Array
       /* int marks[] = new int[50]; // Emoty(null) 50 size's array
        int numbers[] = {1, 2, 3}; // 3 size's array
        int moreNumbers[] = {4, 5, 6}; // 3 size's array
        String fruits[] = {"apple", "mango", "banana"}; // 3 size's array */

        // Input in Array
     /* int marks[] = new int[100];
        Scanner scnr = new Scanner(System.in);
        marks[0] = scnr.nextInt(); // MathMarks
        marks[1] = scnr.nextInt(); // PhysicsMarks
        marks[2] = scnr.nextInt(); // ChemistryMarks

        System.out.println("Math : " + marks[0]);
        System.out.println("Physics : " + marks[1]);
        System.out.println("Chemistry : " + marks[2]);

        // Uodate/Change
        marks[0] += 3;
        System.out.println("Math : " + marks[0]);

        // Percentage(%)
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage: " + percentage + "%");

        // Length
        System.out.println("Length of Array : " + marks.length); // dot(.) operator */

        // Passing Arrays as function argument
      /*  int marks[] = {97, 98, 99}; // 3 size's array

        int nonChangable = 5; // Normal variable
        
        update(marks, nonChangable); // Function call
        System.out.println(nonChangable); // It will not print the function value of nonChangable variable

        for (int i=0; i<marks.length; i++) { // loop for print
            System.out.println(marks[i] + " ");
        }
        System.out.println(); // for next line print */

        // Linear Search in Array
       /* int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Key is at index: " + index);
        } */

        // Find largest number in Array
      /*  int nmbrs[] = {1, 2, 6, 3, 5};
        System.out.print("Largest Value is : " + findLargest(nmbrs)); */

        // Binary Search in Arrays
       /* int n[] = {2, 4, 6, 8, 10, 12, 14};
        int keySearch = 10;

        int index = binarySearch(n, keySearch);
        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println(index);
        } */

        // Reverse an Array
       /*  int numbers[] = {2, 4, 6, 8, 10};
        // For print reverse function
        reverseArray(numbers);
        for (int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        } */

        // Pairs in Array
      /*   int numbers[] = {2, 4, 6, 8, 10};
        pairs(numbers); // Function call */

        // Print SubArrays
      /*   int numbers[] = {2, 4, 6, 8, 10};
        printSubArray(numbers); */
    }
}