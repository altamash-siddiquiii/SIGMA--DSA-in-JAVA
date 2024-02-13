public class Pillers {
    public static void main(String args[]) {
        // Pillers
        // (i) Encapsulation (ii) Inheritance (iii) Polymorphism (iv) Abstraction

        Fish shark = new Fish(); // Inheritance - Single level
        shark.eat(); // Animal's functiion this mean here happening Inheritance
        shark.swim(); // Fish's function

        Dog doggy = new Dog(); // Inheritance - Multi level
        doggy.eat(); // Animal1's function
        doggy.legs = 4; // Mammal's property
        System.out.println(doggy.legs);

        Fish1 tuna = new Fish1(); // Inheritance - Hierarchial
        tuna.breath();
        tuna.swim();
        Bird parrot = new Bird();
        parrot.eat();
        parrot.fly();

        Mammals m = new Mammals(); // Inheritance - Hybrid
        m.breath();
        Human h = new Human();
        h.mammalEats();
        h.humanLegs();
        Lion l = new Lion();
        l.mammalSleep();
        l.lionRoars();
        Birds b = new Birds();
        b.eat();
        Peacock p = new Peacock();
        p.birdFly();
        p.peacockDance();
        Parrot tota = new Parrot();
        tota.birdFly();
        tota.parrotColor();
        Fishes f = new Fishes();
        f.breath();
        f.eat();
        Shark s = new Shark();
        s.fishSwims();
        s.sharkFish();
        Rohu r = new Rohu();
        r.fishSwims();
        r.rohuFish();
    }
}
// (I) SINGLE LEVEL INHERITANCE
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
// (II) MULTI LEVEL INHERITANCE
class Animal1 {
    String color;
    void eat() {
        System.out.println("Eats...");
    }
}
class Mammal extends Animal1 {
    int legs;
}
class Dog extends Mammal {
    String breed;
}
// (III) HIERARCHIAL INHERITANCE 
class Animal2 {
    void breath() {
        System.out.println("Breaths...");
    }
    void eat() {
        System.out.println("Eats...");
    }
}
class Fish1 extends Animal2 {
    void swim() {
        System.out.println("Swims...");
    }
}
class Bird extends Animal2 {
    void fly() {
        System.out.println("Fly...");
    }
}
// (IV) HYBRID INHERITANCE
class Animal3 {
    void eat() {
        System.out.println("Eats.");
    }
    void breath() {
        System.out.println("Breaths.");
    }
}
class Mammals extends Animal3 {
    void mammalEats() {
        System.out.println("Mammal Eats.");
    }
    void mammalSleep() {
        System.out.println("Mammal Sleeps.");
    }
}
class Human extends Mammals {
    void humanLegs() {
        System.out.println("Human have two legs.");
    }
}
class Lion extends Mammals {
    void lionRoars() {
        System.out.println("Lion are roars.");
    }
}
class Birds extends Animal3 {
    void birdFly() {
        System.out.println("Bird Flies.");
    }
}
class Peacock extends Birds {
    void peacockDance() {
        System.out.println("Peacock are Dances.");
    }
}
class Parrot extends Birds {
    void parrotColor() {
        System.out.println("Parrot have green color.");
    }
}
class Fishes extends Animal3 {
    void fishSwims() {
        System.out.println("Fishes are swims.");
    }
}
class Shark extends Fishes {
    void sharkFish() {
        System.out.println("Shark fish.");
    }
}
class Rohu extends Fishes {
    void rohuFish() {
        System.out.println("Rohu fish.");
    }
}
// (V) MULTIPLE INHERITANCE - It founds in C++ but It founds in java as Interfaces