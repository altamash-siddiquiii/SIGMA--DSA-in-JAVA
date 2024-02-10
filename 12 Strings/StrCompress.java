public class StrCompress {
    public static String compress(String str) {
        // Using String
        String newStr = "";

        for (int i=0; i<str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++; // for counting each letter
                i++; // for iterate index(letter)
            }
            newStr += str.charAt(i); // put the same letter if it is not equal to next letter
            if (count > 1) { // for convert to string and put in the newStr
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static String toCompress(String str1) {
        // Using StringBuilder
        StringBuilder sb = new StringBuilder("");

        for (int i=0; i<str1.length(); i++) {
            Integer count = 1;
            while (i<str1.length()-1 && str1.charAt(i) == str1.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str1.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {

        // String Compress - Using String
        String str = "aaabbcccdd";
        System.out.println(compress(str)); // function call to print

        // String Compress - Using StringBuilder
        String str1 = "ABBCCCDDDDEEEEEXYZ";
        System.out.println(toCompress(str1));
    }
}