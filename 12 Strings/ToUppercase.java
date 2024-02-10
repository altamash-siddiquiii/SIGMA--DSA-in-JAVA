public class ToUppercase {
    public static String toUpperCase(String str) {

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0)); // first letter capital
        sb.append(ch);

        for (int i=1; i<str.length(); i++) {
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i)); // for space return
                i++; // for iterate to all letters (index)
                sb.append(Character.toUpperCase(str.charAt(i))); // for first each letter capital
            } else { // for all letter same return after first letter
                sb.append(str.charAt(i));
            }
        }
        return sb.toString(); // Char Convert to String for return(print)
    }
    public static void main(String[] args) {
        // Convert letters to uppercase
        String str = "hyy, i am altamash and i belong to a village of uttar pradesh district";

        System.out.println(toUpperCase(str));
    }
}