public class Constructor {
    public static void main(String[] args) {
        // Object using Constructors
        Student s1 = new Student();
        s1.name = "Alt Mash";
        s1.rollNum = 456;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
      /* Student s2 = new Student("Altamash");
        System.out.println(s2.name);
        Student s3 = new Student(123);
        System.out.println(s3.rollNum); */
        Student s4 = new Student(s1);
        s4.password = "xyz";
        s1.marks[1] = 99; // due to deep cons, marks don't changed but due to shallow, it'll change

        for (int i=0; i<s4.marks.length; i++) {
            System.out.println(s4.marks[i]);
        }
        /*  Multiple creation of constructors of an object is called "Constructor Overloading".
            It's an example of "Polymorphism". */
    }
}
// Class
class Student {
    // Properties
    String name;
    int rollNum;
    String password;
    int marks[];
    // Constructors :-
    // (i) Non Parameterized Constructor
    Student() {
        System.out.println("Constructor is called...");
        marks = new int[3];
    }
    // (ii) Parameterized Constructor
    Student(String name) {
        this.name = name;
        //marks = new int[3];
    }
    Student(int rollNum) {
        this.rollNum = rollNum;
        //marks = new int[3];
    }
    // (iii) Copy Constructor
    // (a) Shallow Copy Constructor
   /*Student (Student s1) {
        this.name = s1.name;
        this.rollNum = s1.rollNum;
        this.password = s1.password;
        marks = new int[3];
        this.marks = s1.marks;
    } */
     // (b) Deep Copy Constructor       }
     Student (Student s1) {
        this.name = s1.name;
        this.rollNum = s1.rollNum;
        this.password = s1.password;
        marks = new int[3];
        for (int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
     }

     // Destructor
     /* In Java, Garbage Collector automatically removes the waste materials like memory, 
      * variables, arrays or etc. while GarbageCollector is not found in C++    */
}