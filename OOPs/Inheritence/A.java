// Parent class (Base class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Derived class)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test
public class A {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // Inherited from Animal
        d.bark(); // Defined in Dog
    }
}
