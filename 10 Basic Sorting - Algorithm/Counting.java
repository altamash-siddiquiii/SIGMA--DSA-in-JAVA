public class Counting {
    public static void countingSort(int array[]) {

        // find largest
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<array.length; i++) {
            largest = Math.max(largest, array[i]);
        }
        // Frequency Count - array
        int count[] = new int[largest+1];
        for (int i=0; i<array.length; i++) {
            count[array[i]]++;
        }
        // sorting
        int j=0;
        for (int i=0; i<count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int array[]) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {

        // Counting Sorting (Advanced)
        int array[] = { 1, 4, 1, 3, 2, 4, 3, 7, 5 };
        // int arr[] = { -1, -4, -1, -3, -2, -4, -3, -7, -5 };

        countingSort(array);
        printArray(array);
    }
}