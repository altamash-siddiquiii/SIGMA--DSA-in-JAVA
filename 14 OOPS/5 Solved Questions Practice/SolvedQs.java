public class SolvedQs {
    public static void main(String[] args) {
        // SOLUTIONS OF ALL PRACTICE QUESTIONS

        // Solution of Practice Question 1
        Student s = new Student();
        s.name = "Alt Mash";

        // Solution of Practice Question 2
        /*  CLASS PERSON CAN ACCESS name and weight */

        // Solution of Practice Question 3
        /* CANNOT CREATE PRIVATE AND PROTECTED (MODIFIER) TO A CLASS, BECAUSE IT WILL BECOME UNUSABLE. WHILE CAN CREATE TO NESTED CLASS, CONSTRUCTOR, METHOD/FUNCTION & FIELD */

        // Solution of Practice Question 4
        Vehicle v = new Vehicle(); Car c = new Car();
        Vehicle vv = new Car(); // ALL THREE ARE CORRECT, CAN CREATE OBJECT.

        // Solution of Practice Question 5
        Vehicle1 v1 = new Car1(); // CONCEPT OF FUNCTION OVERRIDING (POLYMORPHISM :- DUE TO SAME FUNCTION NAME)
        v1.print(); // Car1's(Child's) FUNCTION WILL BE EXECUTE
        Vehicle1 vv1 = new Vehicle1();
        vv1.print();

        // Solution of Practice Question 6
        Vehicle2 v2 = new Car2();
        // v2.print1(); // Car2's OBJECT HAVE BOTH FUNCTION BUT "DUE TO REFERENCE TYPE OF Vehicle2", print1 WILL NOT PRINT
        v2.print(); // Vehicle2's FUNCTION WILL BE PRINT, NOT Car2's
        Vehicle2 vv2 = new Vehicle2();
        vv2.print();
        Car2 c2 = new Car2(); // IT'S TOTALLY Car2's OBJECT (NOT PASSING REFERENCE)
        c2.print(); c2.print1(); // HERE BOTH FUNCTIONS CAN PRINT

        // Solution of Practice Question 7
        /* OOPS COMPONENT :- (I) ABSTRACTION (II) ENCAPSULATION (III) INHERITANCE (POLYMORPHISM) */
        /* AGGREGATIION :- NESTED CLASS (JHUND) */

        // Solution of Practice Question 8
        System.out.println(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);

        // Solution of Practice Question 9
        Test t = new Test();
        t.setMarks(98);
        System.out.println(Test.marks); // NO ANY " IN THIS QUESTION'S CODE

        // Solution of Practice Question 10
        Test1 tt = new Test1();
        tt.changeB();
        System.out.println(Test1.a + Test1.b);
    }
}
// Qs 1
class Student {
    String name;
    int marks;
}
// Qs 2
class Person {
    String name;
    int weight;
}
class Stdnt extends Person {
    int rollNumber;
    String schoolNamme;
}
// Qs 4
class Vehicle {}
class Car extends Vehicle {}
// Qs 5
class Vehicle1 {
    void print() {
        System.out.println("Base Class(Vehicle1)");
    }
}
class Car1 extends Vehicle1 {
    void print() {
        System.out.println("Derived Class(Car1)");
    }
}
// Qs 6
class Vehicle2 {
    void print() {
        System.out.println("Base Class(Vehicle2)");
    }
}
class Car2 extends Vehicle2 {
    void print1() {
        System.out.println("Derived Class(Car2)");
    }
}
// Qs 8
class Book {
    int price;
    static int count; // COMMON(static) VARIABLE

    public Book(int price) { // constructor
        this.price = price;
        count++;
    }
}
// Qs 9
class Test {
    static int marks;

    void setMarks(int marks) {
        this.marks = marks;
    }
}
// Qs 10
class Test1 {
    static int a = 10;
    static int b;

    static void changeB() {
        b = a * 3;
    }
}