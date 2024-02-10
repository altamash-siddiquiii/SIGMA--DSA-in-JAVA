import java.util.*;
public class JavaBasics2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /* String input = sc.next();
        String input = sc.nextLine();
        System.out.print(input); */
        /*int number = sc.nextInt();
        System.out.println(number);
        float price = sc.nextFloat();
        System.out.println(price);
        boolean var = sc.nextBoolean();
        System.out.println(var);
        short s = sc.nextShort();
        System.out.println(s);
        long car = sc.nextLong();
        System.out.println(car);
        double dec = sc.nextDouble();
        System.out.println(dec);
        byte b = sc.nextByte();
        System.out.println(b);
        char ch = sc.next().charAt(0);
        System.out.println(ch); */

        // Sum of a & b (Using input from a user);
        /* int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print(sum); */

        // Product of a & b
        /* int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.print(product); */

        // Area of a circle (a = 3.14*r*r);
        /* float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.print(area); */

        // Type Conversiion in Java
        /* int a = 25;
        long b = a;
        System.out.print(b); */
        /* long a = 21;
        int b = a;
        System.out.print(a); Not allowed */
        /* float dec = sc.nextInt();
        System.out.print(dec); */
        /* int num = sc.nextFloat();
        System.out.print(num); Not allowed */

        // Type Casting in Java
       /* float a = 10.50f;
        int b = (int) a;
        System.out.println(b);
        char ch = 'a';
        int number = (int) ch;
        System.out.println(number);
        char character = 'A';
        int num = (char) character;
        System.out.print(num); */

        // Type Promotion in Expression
       /* char a = 'a';
        char b = 'b';
        System.out.println((int) (b));
        System.out.println((int) (a));
        System.out.println(b-a); */
       /* char c = 'a';
        char d = 'b';
        byte bt = c + d; Not allowed from int to byte */
       /* short A = 5;
        byte B = 25;
        char C = 'c';
        byte bt = (byte)(A + B + C);
        System.out.print(bt); */
       /* int a = 10;
        long b = 11;
        double c = 12;
        float d = 21.12f;
        double ans = a + b + c + d;
        System.out.print(ans); */
       /* byte b = 5;
        b = (byte)(b * 2);
        System.out.print(b); */
    }
}