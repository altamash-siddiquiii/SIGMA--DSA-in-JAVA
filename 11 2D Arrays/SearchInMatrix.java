public class SearchInMatrix {
    public static boolean stairCaseSearch(int matrix[][], int key) {
        // Binary Search in 2D Array
        // Search from the top right corner
        int row = 0; // It's mean starting row (i)
        int col = matrix[0].length-1; // It's mean ending column (j)

        while (row < matrix.length && col >= 0) {
            if (key == matrix[row][col]) {
                System.out.println("Key is at cell (" + row + "," + col + ")");
                return true;
            }
            else if (key < matrix[row][col]) {
                col--;
            }
            else { // (key > matrix[row][col])
                row++;
            }
        }
        System.out.println("Key is not found.");
        return false;
    }
    public static boolean searchStairCase(int matrix[][], int key) {
        // Search from the left bottom corner
        int col = 0; // startCol
        int row = matrix.length-1; // endRow

        while (row >= 0 && col < matrix[0].length) {
            if (key == matrix[row][col]) {
                System.out.println("Key is at index (" + row + "," + col + ")");
                return true;
            }
            else if (key > matrix[row][col]) {
                col++;
            }
            else { // key < matrix[row][col]
                row--;
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void main(String[] args) {

        // Search in Sorted Matrix (2D array)
        int matrix[][] = { { 10, 20, 30, 40 },
                            { 15, 25, 35, 45 },
                            { 27, 29, 37, 48 },
                            { 32, 33, 39, 50 } };
        int key = 33;

        stairCaseSearch(matrix, key);
        searchStairCase(matrix, key);
    }
}