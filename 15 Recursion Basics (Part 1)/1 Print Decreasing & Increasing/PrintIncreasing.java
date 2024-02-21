public class PrintIncreasing {
    public static void main(String[] args) {

        // PRINT NUMBERS IN INCREASING ORDER - USING RECURSIVE FUNCTION

        int n = 5;
        printIncNum(n); // Mam's solution

        System.out.println(); // FOR NEXT LINE

        printIncOrd(6); // chatGPT solution

        System.out.println(); // FOR NEXT LINE

        int m = 1;
        printInc(m); // My solution
    }
    public static void printIncNum(int n) {
        if (n == 1) { // IF WE REMOVES THIS CONDITION/BASE, SO THEY WILL BE HAPPEN CALL "STACK OVERFLOW"
            System.out.print(n + " ");
            return;
        }
        printIncNum(n - 1); // CALLED "CALL FRAME"
        System.out.print(n + " ");
    }
    public static void printInc(int m) {

        if (m == 10) {
            System.out.print(10);
            return;
        }
        System.out.print(m + " ");
        printInc(m + 1);
    }
    public static void printIncOrd(int v) {

        if (v > 10) {
            return;
        }
        System.out.print(v + " ");
        printIncOrd(v + 1);
    }
}