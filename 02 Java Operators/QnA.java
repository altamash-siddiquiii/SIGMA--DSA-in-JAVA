import java.util.*;
public class QnA {
    public static void main(String args[]) {
        // Question 1 and His Solution
       /* int x = 2, y = 5;
        int exp1 = (x * y / x), exp2 = (x * (y / x) );
        System.out.print(exp1 + ", " + exp2); */

        // Question 2 and His Solution
       /* int x=200, y=50, z=100;
        if (x > y && y > z) {
            System.out.print("Hlo");
        }
        if (z > y && z < x) {
            System.out.print("Java");
        }
        if ((y+200) < x && (y+150) < z) {
            System.out.print("Hlw Java");
        } */

        // Question 3 and His Solution
       /* int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.print("x: " + x + ", y: " + y + ", z: " + z); */

        // Question 4 and His Solution
       /* int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3*(x+34)+9*(a+b*c)+(3+y*(2+a))/(a+b*y);
        System.out.print(exp); */

        // Question 5 and His Solution
        int x = 10, y = 5;
        int exp1 = (y * (x/y + x/y));
        int exp2 = (y * x/y + y * x/y);
        System.out.print("exp1: " + exp1 + ", exp2: " + exp2);
    }
}