import java.util.*;
public class ConditionalStatements {
    public static void main(String args[]) {

        // if else statements
      /*  int age = 18;
        if (age >= 18) {
            System.out.print("You are adult, You can vote and ");
        }
        if (age <= 18 && age > 13) {
            System.out.println("You can drive.");
        }
        else {
            System.out.println("You are not adult");
        } */

        // Print the largest of 2 numbers
      /*  int A = 41;
        int B = 125;
        if (A >= B) {
            System.out.print("A is the largest number of 2.");
        } else {
            System.out.print("B is the largest number of 2.");
        } */

        // Print if number is EVEN or ODD ? (from user input)
      /*  Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        } */

        // else if statements
      /*  int age = 18;
        if (age >= 18) {
            System.out.print("You're adult.");
        }
        else if (age >= 13 && age <= 18) {
            System.out.print("teenager");
        }
        else {
            System.out.print("You're child.");
        } */

        // Income Tax Calculator 
       /* Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        int Tax;
        if (Income <= 500000) {
            Tax = 0;
        }
        else if (Income > 500000 && Income <= 1000000) {
            Tax = (int) (Income * 0.2);
        }
        else {
            Tax = (int) (Income * 0.3);
        }
        System.out.print("Your Tax is " + Tax); */

        // Print the largest of 3 numbers
       /* int A = 1000;
        int B = 224;
        int C = 151;
        if (A >= B && A > B) {
            System.out.print("A is the largest of 3 numbers.");
        } else if (B > C) {
            System.out.print("B is the largest of 3 numbers.");
        } else {
            System.out.print("C is the largest of 3 numbers.");
        } */

        // Ternary Operators
       /* int number = 1;
        String Number = (number%2 == 0)? "EVEN" : "ODD";
        System.out.print(Number); */

        // Check that student is PASS or FAIL
    /* int Marks = 41;
        String reportCard = (Marks>=33)? "PASS" : "FAIL";
        System.out.print(reportCard); */

        // Switch statement
       /* int number = 1;
        switch (number) {
            case 1 : System.out.print("Biryani"); break;
            case 2 : System.out.print("Chicken Fry"); break;
            case 3 : System.out.print("Cold Drink"); break;
            default : System.out.print("Water");
        } */

        // Switch Statement from user input
       /* Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        switch (character) {
            case 'a' : System.out.print("Biryani"); break;
            case 'b' : System.out.print("Chicken Fry"); break;
            case 'c' : System.out.print("Cold Drink"); break;
            default : System.out.print("Water");
        } */

        // Create a Calculator
     /*   Scanner sc = new Scanner(System.in);
        System.out.print("Press firstNum : ");
        int firstNum = sc.nextInt();
        System.out.print("Press Operator : ");
        char Operator = sc.next().charAt(0);
        System.out.print("Press secondNum : ");
        int secondNum = sc.nextInt();
        switch (Operator) {
            case '+' : System.out.print("Your ans : " + (firstNum + secondNum)); break;
            case '-' : System.out.print("Your ans : " + (firstNum - secondNum)); break;
            case '*' : System.out.print("Your ans : " + (firstNum * secondNum)); break;
            case '/' : System.out.print("Your ans : " + (firstNum / secondNum)); break;
            case '%' : System.out.print("Your ans : " + (firstNum % secondNum)); break;
            default : System.out.print("Wrong Operator");
        } */
    }
}