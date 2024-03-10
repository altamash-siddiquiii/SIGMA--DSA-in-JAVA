public class Qs2 {
    static String DIGITS[] = {"zero", "one", "two", "three", "four",
                             "five", "six", "seven", "eight", "nine"};
    public static void main(String[] args) {
        // Qs 2 : Convert a integer number into String of english
        int num = 1947;
        numberToEnglish(num);
    }
    public static void numberToEnglish(int num) {
        // Base Case
        if (num == 0) {
            return;
        }
        int lastDigit = num % 10;
        numberToEnglish(num / 10);
        System.out.print(DIGITS[lastDigit] + " ");
    }
}