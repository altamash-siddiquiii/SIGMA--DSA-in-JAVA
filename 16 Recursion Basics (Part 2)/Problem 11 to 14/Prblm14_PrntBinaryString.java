public class Prblm14_PrntBinaryString {
    public static void main(String[] args) {
        /* Problem 14 : Binary String Problem
        (i) Print all "Binary Strings of size N without consecutive ONES. */
        System.out.println("Binary Strings without consecutive ones");
        printBinaryString(3, 0, "");
    /* (ii) Print all "Binary Strings" of size N without consecutive ZEROS. */
    
    System.out.println("Binary Strings without consecutive zeros");
    printBinString(3, 0, "");
    }
    // (i) Function to "Print Binary Strings" without consecutive ONES :-
    public static void printBinaryString(int n, int lastIndex, String str) {
        // Base Case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinaryString(n-1, 0, str+"0");
        if (lastIndex == 0) {
            printBinaryString(n-1, 1, str+"1");
        }
        /*
        if (lastIndex == 0) { // If last index/digit is 0 then add either 0 or 1
            printBinaryString(n-1, 0, str+"0");
            printBinaryString(n-1, 1, str+"1");
        }
        else { // If last index/digit is 1 then add only 0
            printBinaryString(n-1, 0, str+"0");
        } */
    }
    // (ii) Function to "Print Binary Strings" without consecutive ZEROS :-
    public static void printBinString(int n, int lastIndex, String str) {
        // Base Case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        if (lastIndex == 1) { // If last index/digit is 1 then add either 1 or 0
            printBinString(n-1, 1, str+"1");
            printBinString(n-1, 0, str+"0");
        }
        else { // If last index/digit is 0 then add only 1
            printBinString(n-1, 1, str+"1");
        }
        /* 
        printBinString(n-1, 1, str+"1");
        if (lastIndex == 1) {
            printBinString(n-1, 0, str+"0");
        } */
    }    
}