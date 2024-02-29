public class LastOccur {
    public static void main(String[] args) {
        
        // Find last occurance of an element in an array
        int arr[] = {2, 5, 8, 4, 9, 1, 6, 4, 7, 3};
        int key = 4; // Target key
        int lastOccurance = findLqstOccurance(arr, 0, key); // searching from up to down
        int lastOccurance1 = findLastOccurance1(arr, arr.length-1, key); // searching from down to up
        if (lastOccurance != -1) {
            System.out.println("(i) Last Occurance of "+key+" is found at index " + lastOccurance + ".");
            System.out.println("(ii) Last Occurance of "+key+" is found at index " + lastOccurance1 + ".");
        } else {
            System.out.println(key + " is not found in the array.");
        }
    }
    public static int findLqstOccurance(int arr[], int i, int key) {

        if (i == arr.length) { // BaseCase: Not found
            return -1;
        }
        
        int isFound = findLqstOccurance(arr, i+1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static int findLastOccurance1(int arr[], int i, int key) {
        if (i < 0) { // BaseCase: Key Not Found
            return -1;
        }
        if (arr[i] == key) { // BaseCase: Key Found
            return i;
        }
        return findLastOccurance1(arr, i-1, key);
    }
}