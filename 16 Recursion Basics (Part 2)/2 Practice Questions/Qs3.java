public class Qs3 {
    public static void main(String[] args) {
        // Qs 3 : Find the Length of a String
        String str = "Alt Mash";
        System.out.println("Length of String("+str+") is : " + lengthOfString(str, 0));
        System.out.println("Length of String is : " + findLength("Shaikh Siddiqui"));
        System.out.println("Length of String is : " + length("Altamash Siddiqui"));
    }
    public static int lengthOfString(String str, int i) { // Solution by Me
        if (i == str.length()) { // Base Case
            return str.length();
        }
        return lengthOfString(str, i+1);
    }
    public static int findLength(String str) { // Solution by Me
        if (str.equals("")) { // Base Case
            return 0;
        }
        return findLength(str.substring(1)) +1;
    }
    public static int length(String str) { // Solution by Mam
        if (str.length() == 0) { // Base Case
            return 0;
        }
        return length(str.substring(1)) +1;
    }
}