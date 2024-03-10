public class Prblm6 {
    public static void main(String[] args) {
        // Problem 6 : Remove Duplicates in a String
        String str = "abacbdcba";
        removeDuplicates(str, 0, "");
    }
    public static boolean map[] = new boolean[26];
    public static void removeDuplicates(String str, int i, String newStr) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        // char currChar = str.charAt(i); // We can also replace str.charAt(i)  with currChar
        if (map[str.charAt(i) - 'a']) {
            // Duplicate found, No add in the newStr (This mean ignore/remove to char)
            removeDuplicates(str, i+1, newStr);
        } else {
            // No Duplicates, So add this char in the newStr
            newStr += str.charAt(i);
            map[str.charAt(i) - 'a'] = true;
            removeDuplicates(str, i+1, newStr);
        }
    }
}