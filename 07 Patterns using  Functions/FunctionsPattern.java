public class FunctionsPattern {
    public static void hollow_rectangle(int totalRows, int totalCols) {
        for (int row=1; row<=totalRows; row++) {
            for (int col=1; col<=totalCols; col++) {
                if (row==1 || row==totalRows || col==1 || col==totalCols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_rotated_half_pyramid(int totalRowsCols) {
        // outer loop for row (line)
        for (int line=1; line<=totalRowsCols; line++) {
            // inner loop for column (space)
            for (int space=1; space<=totalRowsCols-line; space++) {
                System.out.print("  ");
            }
            // inner loop for column (star)
            for (int star=1; star<=line; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void inverted_rotated_half_pyramid_withNumbrs(int totalRowsCols) {
        for (int line=1; line<=totalRowsCols; line++) {
            for (int nmbr=1; nmbr<=(totalRowsCols-line+1); nmbr++) {
                System.out.print(nmbr + " ");
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int totalRowsCols) {
        int counterN = 1;
        for (int i=1; i<=totalRowsCols; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(counterN + " ");
                counterN++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int totalRowsCols) {
        for (int i=1; i<=totalRowsCols; i++) {
            for (int j=1; j<=i; j++) {
                if ( (i+j) % 2 == 0) { // for even
                    System.out.print("1 ");
                } else { // for odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int totalRowsCols) {
        // 1st half of the butterfly pattern
        for (int i=1; i<=totalRowsCols; i++) { // outer loop
            for (int j=1; j<=i; j++) { // inner loop for first stars
                System.out.print("* ");
            }
            for (int j=1; j<=2*(totalRowsCols-i); j++) { // for middle spaces
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) { // for last stars
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for (int i=totalRowsCols; i>=1; i--) { // outer loop
            for (int j=1; j<=i; j++) { // inner loop for stars
                System.out.print("* ");
            }
            for (int j=1; j<=2*(totalRowsCols-i); j++) { // for middle spaces
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) { // for last stars
                System.out.print("* ");
            }
            System.out.println(); // for each next line
        }
    }
    public static void solid_rhombus(int totalRows) {
        for (int i=1; i<=totalRows; i++) { // outer loop
            for (int j=1; j<=totalRows-i; j++) { // inner loop for first spaces
                System.out.print("  ");
            }
            for (int j=1; j<=totalRows; j++) {
                System.out.print("* ");
            }
            // We can also use this code but it is long than above last inner code and also above code is easy 
           /* for (int j=1; j<=i; j++) { // for middle stars
                System.out.print("* ");
            }
            for (int j=1; j<=totalRowsCols-i; j++) { // for last stars
                System.out.print("* ");
            } */ // No need for the last spaces
            System.out.println(); // for each next line after the inner loops
        }
    }
    public static void hollow_rhombus(int n) {
        for (int i=1; i<=n; i++) { // outer loop
            for (int j=1; j<=n-i; j++) { // for spaces
                System.out.print("  ");
            }
            for (int j=1; j<=n; j++) { // for hollw rhombus
                if (i==1 || i==n || j==1 || j==n) { // for boundries stars
                    System.out.print("* ");
                } else { // for inside spaces
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n) {
        for (int i=1; i<=n; i++) { // for lines (outer loop)
            for (int j=1; j<=(n-i); j++) { // for spaces (inner loop)
                System.out.print("  ");
            }
            for (int j=1; j<=(2*i)-1; j++) { // for stars
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for (int i=n; i>=1; i--) { // for lines (outer loop)
            for (int j=1; j<=(n-i); j++) { // for spaces (inner loop)
                System.out.print("  ");
            }
            for (int j=1; j<=(2*i)-1; j++) { // for stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Hollow Rectangle (Previous Pattern Class's Work)
      /* hollow_rectangle(5, 55); */

    //    Inverted Rotated Half Pyramid
   /* inverted_rotated_half_pyramid(4); */

   // Inverted Rectangle Half Pyramid with Numbers
  /* inverted_rotated_half_pyramid_withNumbrs(5); */

  // Floyd's Triangle Pattern
 /* floyds_triangle(5); */

 // 0, 1 Triangle Pattern
/* zero_one_triangle(5); */

// Butterfly Pattern
/* butterfly(5); */

// Solid Rhombus Pattern
/* solid_rhombus(5); */

// Hollow Rhombus Pattern
/* hollow_rhombus(5); */

// Diamond Pattern
/* diamond(4); */
    }
}