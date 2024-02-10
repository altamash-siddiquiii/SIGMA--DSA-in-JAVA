public class Palindrome {
    public static boolean isPalindrome(String str) {
        // loop to check
        int n = str.length();
        for (int i=0; i<=n/2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i) ) {
                // Not a Palindrome
                System.out.println(str + " is not a Palindrome.");
                return false;
            }
        }
        System.out.println(str + " is a Palindrome");
        return true;
    }
    public static void main(String[] args) {
        /* Question 1 of lectures 
         Check if a String is a Palindrome
         Examples : */
         String str1 = "racecar";
         String str2 = "noon";
         String str3 = "madam";
         String str4 = "shaikh";

         isPalindrome(str1);
         isPalindrome(str2);
         isPalindrome(str3);
         isPalindrome(str4);
    }
}