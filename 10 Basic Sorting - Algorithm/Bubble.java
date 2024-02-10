public class Bubble {
    public static void bubbleSort(int array[]) {

        // Outer loop from start to 2nd last index
        for (int turn = 0; turn < array.length; turn++) { // <array.length-1 by mam
            // Inner loop for the changing of values with the help of conditional statement
            for (int j = 0; j < array.length - 1; j++) { // <array.length-1-turn by mam
                // Condition to replacing the values with the help of swapping
                if (array[j] > array[j + 1]) {
                    // swapping
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Bubble Sorting - Algorithm

        int array[] = { 5, 4, 1, 3, 2 };

        bubbleSort(array);
        printArray(array);
    }
}