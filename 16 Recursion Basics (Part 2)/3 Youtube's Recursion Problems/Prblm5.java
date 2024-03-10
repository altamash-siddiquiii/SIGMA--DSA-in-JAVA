public class Prblm5 {
    public static void main(String[] args) {
        // Problem 5 : Move all 'x' to the end of the String
        String str = "axbxxc";
        moveX(str, 0, 0, new StringBuilder(""));
    }
    public static void moveX(String str, int i, int count, StringBuilder newStr) {
        if (i == str.length()) {
            for (int j=0; j<count; j++) {
                newStr.append('x');
            }
            System.out.println(newStr);
            return;
        }
        if (str.charAt(i) == 'x') {
            count++;
            moveX(str, i+1, count, newStr);
        } else {
            newStr.append(str.charAt(i));
            moveX(str, i+1, count, newStr);
        }
    }
}