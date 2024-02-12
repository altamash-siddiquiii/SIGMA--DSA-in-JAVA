public class Pillers {
    public static void main(String[] args) {
        // Pillers of Java
        // (i) Encapsulation (ii) Inheritance (iii) Polymorphism (iv) Abstraction
        
        Fish shark = new Fish();
        shark.eat();
    }
    // Base Class (Parent class)
    class Animal {
        String color; // property
        void eat() { // function
            System.out.println("They eats...");
        }
        void breath() { // function
            System.out.println("They breaths...");
        }
    }
    // Derived Class (Child class)
    class Fish extends Animal {
        int fins; // property
        void swim() { // function
            System.out.println("They swims...");
        }
    }
}