public class Qs1 {

    public static void main(String[] args) {
        // Qs1 : Find all the occurences of a given element (Key)
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        printAllOccurrence(arr, key, 0);
    }
    public static void printAllOccurrence(int arr[], int key, int i) {
        // Base Case
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        printAllOccurrence(arr, key, i+1);
    }
}