public class OddOrEven {
    public static void printOddOrEven(int num) {

        // Check using Binary AND which called Bit Mask
        int bitMask = 1;

        // Condition to check ODD or EVEN
        if ((num & bitMask) == 0) {
            // even case
            System.out.println("EVEN");
        } else {
            // odd case
            System.out.println("ODD");
        }
    }
    public static void main(String[] args) {
        
        // Check if a number is Odd or Even
        printOddOrEven(3);
        printOddOrEven(10);
        printOddOrEven(1001);
    }
}