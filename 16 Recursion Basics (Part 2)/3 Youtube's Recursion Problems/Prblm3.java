public class Prblm3 {
    public static void main(String[] args) {
        // Problem 3 : Find first and last Occurrence of an element from String
        String str = "abcbabcbabc";
        findOccurance(str, 0, 'a');
    }
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int i, char elmnt) {
        if (i == str.length()) {
            System.out.println("First occurance of '" + elmnt + "' is at index : " + first);
            System.out.println("Last occurance of '" + elmnt + "' is at index : " + last);
            return;
        }
        if (str.charAt(i) == elmnt) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        findOccurance(str, i+1, elmnt);
    }
}