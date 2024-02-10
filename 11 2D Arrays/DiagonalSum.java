public class DiagonalSum {
    public static int diagonalSum_nOne(int matrix[][]) {

        // 0 (n) metod (Time Complexity)
        int sum = 0;

        for (int i=0; i<matrix.length; i++) {
            // Primary Diagonal
            sum += matrix[i][i];

            // Secondary Diagonal
            if (i != matrix.length-1-i) // This condition is for odd matrix but it will work on even matrix
            sum += matrix[i][matrix.length-1-i]; // i+j=matrix.length-1; j=matrix.length-1-i;
        }
        return sum;
    }
    public static int diagonalSum_nTwo(int matrix[][]) {
        
        // 0 (n^2) method (Time Complexity)
        int sum = 0;

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                // Primary Diagonal
                if (i == j) {
                    sum += matrix[i][j];
                }
                // Secondary Diagonal
                else if (i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        // Print Diagonal Sum (Cross Sum of Matrix)

        int matrix[][] = { { 1, 2, 3, 4 },
                         { 5, 6, 7, 8 },
                          { 9, 10, 11, 12 },
                           { 13, 14, 15, 16 } };

                           System.out.println(diagonalSum_nOne(matrix));
                           System.out.print(diagonalSum_nTwo(matrix));
    }
}