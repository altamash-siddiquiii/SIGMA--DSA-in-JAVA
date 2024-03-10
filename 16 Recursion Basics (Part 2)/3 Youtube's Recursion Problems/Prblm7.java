public class Prblm7 {
    public static void main(String[] args) {
        // Problem 7 : Print all the Subsequences of a String
        String str = "abc";
        printSubsequences(str, 0, "");
    }
    public static void printSubsequences(String str, int i, String newStr) {
        if (i == str.length()) {
            System.out.print(newStr + " ");
            return;
        }
        // To be
        char currChar = str.charAt(i);
        printSubsequences(str, i+1, newStr +currChar); // Add currChar
        // Not to be
        char space = '_';
        printSubsequences(str, i+1, newStr +space); // No add anything but i'm adding space for the better understanding to me
    }
}