public class Pillers1 {
    public static void main(String[] args) {
        // Polymorphism - inheritance
        // (i) Compile Time Polymorphism (Method Overloading)
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 10));
        System.out.println(calc.sum(5.5f, 4.5f));
        System.out.println(calc.sum(5, 5, 5));
        
        // (ii) Run Time Polymorphism (Method OverRiding)
        Goat g = new Goat();
        g.eat();
    }
}
// Polymorphism - inheritance
// (I) METHOD OVERLOADING - Compile Time Polymorphism
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
    float sum(float a, float b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
// (II) METHOD OVERRIDING - Run Time Polymorphism
class Animal {
    void eat() {
        System.out.println("Eats anything...");
    }
}
class Goat extends Animal {
    void eat() {
        System.out.println("Eats grass.");
    }
} // Child function will be called.