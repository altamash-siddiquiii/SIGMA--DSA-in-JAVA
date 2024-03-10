public class Prblm2 {
    public static void main(String[] args) {
        // Problem 2 : Print a reverse String
        String str = "ABCD";
        reverseString(str, str.length()-1);
        System.out.println(); // Next line space
        String reversed = printReverseString(str);
        System.out.println("Original string " + str + " after the reversed string is " + reversed);
    }
    public static void reverseString(String str, int i) {
        if (i == 0) {
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        reverseString(str, i-1);
    }
    public static String printReverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return printReverseString(str.substring(1)) + str.charAt(0);
    }
}