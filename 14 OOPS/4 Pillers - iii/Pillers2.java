public class Pillers2 {
    public static void main(String[] args) {
        // Abstraction
        // (i) Abstract classes
        // Animal a = new Animal(); // Cannot create object of abstract class
        Horse h = new Horse();
        h.eat(); h.walk(); System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat(); c.walk(); System.out.println(c.color);
        Mustang horse = new Mustang();
        // Animal -> Horse -> Mustang (Hierarchae constructor is calling line by line)
    }
}
// Abstraction
// (I) ABSTRACT CLASSES
abstract class Animal {
    String color;
    Animal() { // Can't create object but can create a constructor of abstract class
        color = "Brown.";
        System.out.println("Animal constructor is called...");
    }
    void eat() { // Non abstract method/function
        System.out.println("Animal eats.");
    }
    abstract void walk(); // Abstract method/function
}
class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is called...");
    }
    void changeColor() {
        color = "Dark Brown.";
    }
    void walk() { // Compulsary to create method here of it's parent's class
        System.out.println("Walks on 4 legs.");
    }
}
class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called...");
    }
}
class Chicken extends Animal {
    Chicken() {
        System.out.println("Chicken constructor is called...");
    }
    void changeColor() {
        color = "Yellow.";
    }
    void walk() { // Compulsary to create method here of it's parent's class
        System.out.println("Walks on 2 legs.");
    }
}