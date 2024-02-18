public class Keywords {
    public static void main(String[] args) {
        // Keywords :-
        // (i) Static Keyword
        Student s1 = new Student();
        s1.schoolName = "AC";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        Student s3 = new Student();
        s3.schoolName = "ac";
        System.out.println(s3.returnPercentage());
        Student s4 = new Student();
        System.out.println(s4.schoolName);
        Student.Altamash obj = new Student.Altamash(); // Nested Class's object
        obj.classDisplay();

        // (ii) Super Keeyword
        Horse h = new Horse();
        System.out.println(h.color);
    }
}
// KEYWORDS
// (I) STATIC KEYWORD
class Student {
    String name;
    int rollNum;
    // Static variable
    static String schoolName; // static declares for one time (use everywhere)
    // Static method/function
    static int returnPercentage() { // for one time declare
        int math = 85, phy = 81, chem = 88;
        return (math + phy + chem) / 3;
    }
    // Static block
    static {
        System.out.println("This is a Static Block.");
    }
    // Static NestedClass
    static class Altamash {
        void classDisplay() {
            System.out.println("This is a Static Nested Class.");
        }
    }

    void setName(String name) { // Setters
        this.name = name;
    }
    String getName() { // Getters
        return this.name;
    }
}
// (II) SUPER KEYWORD
class Animal {
    String color;
    Animal() {
        System.out.println("Animal constructor is called...");
    }
}
class Horse extends Animal {
    Horse() {
        super(); // super mean it's parent class
        super.color = "Horse color is Brown."; // in super, first execute parent then child
        System.out.println("Horse constructor is called...");
    }
}