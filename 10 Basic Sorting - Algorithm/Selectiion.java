public class Selectiion {
    public static void selectionSort(int array[]) {

        for (int t = 0; t < array.length; t++) { // <array.length-1 by mam
            int minPos = t; // Assuming that currentPosition is my minimumPosition

            for (int j = t; j < array.length; j++) { // =t+1 by mam
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            // swapping
            int temp = array[minPos];
            array[minPos] = array[t];
            array[t] = temp;
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {

        // Selectiion Sorting
        int array[] = { 5, 2, 1, 4, 3 };

        selectionSort(array);
        printArray(array);
    }
}