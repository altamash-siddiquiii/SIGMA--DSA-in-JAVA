public class Sum {
    public static void main(String[] args) {
        
        // PRINT SUM OF N NATURAL NUMBERS
        int n = 5;

        System.out.println(printSum(n)); // Mam
        System.out.println("SUM OF " + n + " NATURAL NUMBERS" + " = " + sumOfNaturalNums(n)); // Me
    }
    public static int printSum(int n) {

        if (n == 1) {
            return 1;
        }

        int sN_1 = printSum(n - 1);
        int sN = n + sN_1;

        return sN;
    }
    public static int sumOfNaturalNums(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNums(n - 1);
    }
}