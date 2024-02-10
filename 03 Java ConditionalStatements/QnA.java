import java.util.*;
public class QnA {
    public static void main(String args[]) {

        // Solution of Question no. 1;
     /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        if (number>0) {
            System.out.print("Whether is Positive.");
        } else if (number<0) {
            System.out.print("Whether is Negative.");
        } else {
            System.out.print("Whether is Zero.");
            } */

            // Solution of Question no. 2;
        /*  double temperature = 103.5;
            if (temperature>100) {
                System.out.print("You have a fever.");
            } else {
                System.out.print("You don't have a fever.");
            } */

            // Solution of Question no. 3;
           /* Scanner sc = new Scanner(System.in);
            System.out.print("Enter week number(1-7): ");
            int week = sc.nextInt();
            switch (week) {
                case 1 : System.out.print("Monday"); break;
                case 2 : System.out.print("Tuesday"); break;
                case 3 : System.out.print("Wednesday"); break;
                case 4 : System.out.print("Thursday"); break;
                case 5 : System.out.print("Friday"); break;
                case 6 : System.out.print("Saturday"); break;
                case 7 : System.out.print("Sunday"); break;
                default : System.out.print("Invalid input! Please enter a valid week number between 1 to 7.");
            } */

            // Solution of Question no. 4;
          /*  int a = 63, b = 36;
            boolean x = (a < b)? true : false;
            System.out.println(x);
            int y = (a > b)? a : b;
            System.out.print(y); */

            // Solution of Question no. 5;
            Scanner sc = new Scanner(System.in);
           /* System.out.print("Input Year: ");
            int year = sc.nextInt();
            String result = (year%4==0)? ((year%100==0)? ((year%400==0)? "Leap Year" : "Not a Leap Year") : "Leap Year") : "Not a Leap Year";
            System.out.print(result); */

          /*   System.out.print("Input the year: ");
            int year = sc.nextInt();
            boolean a = (year % 4) == 0;
            boolean b = (year % 100) != 0;
            boolean  c = ((year % 100 == 0) && (year % 400 == 0));
            if (a && (b || c)) {
                System.out.print(year + " is a leap year");
            } else {
                System.out.print(year + " is not a leap year");
            } */
            
             do {
                System.out.print("Enter year: ");
            int year = sc.nextInt();
            if (year%4==0) {
                if (year%100==0) {
                    if (year%400==0) {
                        System.out.println(year + " is a leap year.");
                    } else {
                        System.out.println(year + " is not a leap year.");
                    }
                } else {
                    System.out.println(year + " is a leap year.");
                }
            } else {
                System.out.println(year + " is not a leap year.");
            }
            } while (true);
    }
}