public class CompareSubstrings {
    public static String subString(String str, int si, int ei) {

        String substr = "";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        
        // Compare in Strings
        String s1 = "Shaikh";
        String s2 = "Shaikh";
        String s3 = new String("Shaikh");

        // Compare
        if (s1 == s2) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
        /* if (s1 == s3) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        } */
        if (s1.equals(s3)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        // substring
        String str = "HelloWorld";

        // Inbuilt function for substring
        System.out.println(str.substring(0, 5));
        // Function Call
        System.out.println(subString(str, 5, 10));
    }
}