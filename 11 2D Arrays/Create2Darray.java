import java.util.*;
public class Create2Darray {
    public static boolean search(int matrix[][], int key) {
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                if (matrix[i][j] == key) {

                    System.out.println("Key is at cell (" + i + "," + j + ")" );
                    return true;
                }
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void printLargestAndSmallest(int matrix[][]) {

        // Initialized largest and smallest 
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if ( smallest > matrix[i][j] ) {
                    smallest = matrix[i][j];
                }
                if ( largest < matrix[i][j] ) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest is : " + smallest);
        System.out.println("Largest is : " + largest);
    }
    public static void main(String[] args) {
        
        // Creation of 2D Array
        int matrix[][] = new int [3][3];
        int n = 3, m = 3;
        // int n = matrix.length, m = matrix[0].length;  // Also it can be use

        // Input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter values for 2D array : ");
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
                
                System.out.print(matrix[i][j] + " "); // for print (output)
            }
            System.out.println();
        }
        // Output for print but we can use print statement inside of loop like above
        /*  for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } */

        search(matrix, 5); // Function call
        printLargestAndSmallest(matrix);
    }
}