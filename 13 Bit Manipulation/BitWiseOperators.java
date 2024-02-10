public class BitWiseOperators {
    public static void main(String[] args) {
        // Bit-Wise Operators
        int a = 6, b = 4;

        // Binary AND (&) Operator
        System.out.print("Binary AND is : ");
        System.out.println(a & b);

        // Binary OR (|) Operator
        System.out.print("Binary OR is : ");
        System.out.println(a | b);

        // Binary XOR (^) Operator
        System.out.print("Binary XOR is : ");
        System.out.println(a ^ b);

        // Binary One's Complement (~) Operator
        System.out.print("Binary One's Complement is : ");
        System.out.println(~-2);

        // Binary Left Shft (<<) Operator
        System.out.print("Binary Left Shift is : ");
        System.out.println(a << b);
        // Also calculate with this formula [a<<b = (a * 2^b)]

        // Binary Right Shift (>>) Operator
        System.out.print("Binary Right Shift is : ");
        System.out.println(64 >> b);
        // Also calculate with this formula [a>>b = (a / 2^b)]
    }
}