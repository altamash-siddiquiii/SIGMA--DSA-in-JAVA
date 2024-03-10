public class Prblm9 {
    public static void main(String[] args) {
        // Problem 9 : Print Keypad Combination
        String str ="12";

        printKeypadCombination(str, 0, "");
    }
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKeypadCombination(String str, int i, String combination) {
        if (i == str.length()) {
            System.out.print(combination + " ");
            return;
        }
        char currChar = str.charAt(i);
        String mapping = keypad[currChar - '0'];

        for (int j=0; j<mapping.length(); j++) {
            printKeypadCombination(str, i+1, combination +mapping.charAt(j));
        }
    }
}