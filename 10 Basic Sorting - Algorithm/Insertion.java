public class Insertion {
    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int prev = i - 1;

            // Finding out the correct position to insert
            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            // insertion
            array[prev + 1] = curr;
        }
    }
    public static void prinntArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {

        // Insertion Sorting
        int array[] = { 5, 2, 4, 1, 3 };

        insertionSort(array);
        prinntArray(array);
    }
}