public class FirstOccur {
    public static void main(String args[]) {

        // Find First Occurance from array
        int arr[] = {1, 5, 4, 8, 3, 9, 4, 3}; // array
        int i = 0; /* index */ int key = 3; // key

        System.out.println("Key found at index : " + firstOccurance(arr, i, key));
    }
    public static int firstOccurance(int arr[], int i, int key) {

        if (i == arr.length) { // Base CAse
            return -1; // if not found at the end then return minus value
        }
        if (arr[i] == key) { // if key is found at any index return that
            return i; // return index
        }
        return firstOccurance(arr, i+1, key); // if not found then check at the next index
    }
}