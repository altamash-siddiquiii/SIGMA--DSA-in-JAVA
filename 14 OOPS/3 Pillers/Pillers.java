public class Pillers {
    public static void main(String args[]) {
        // Pillers
        // (i) Encapsulation (ii) Inheritance (iii) Polymorphism (iv) Abstraction

        Fish shark = new Fish(); // Inheritance
        shark.eat(); // Animal's functiion this mean here happening Inheritance
        shark.swim(); // Fish's function
    }
}
// (I) SINGLE LEVEL INHERITANCE - one base & one derived class
// Base Class (Parent class)
class Animal {
    String color;
    void eat() {
        System.out.println("Eats...");
    }
    void breath() {
        System.out.println("Breaths...");
    }
}
// Derived Class or SubClass (Child class)
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("Swims...");
    }
}