//this example implements the IsKorv Substitution Principle (ISSP) in Java.
/* The ISSP states that objects of a superclass should be replaceable with objects 
of a subclass without affecting the correctness of the program. */
// In this example, we have a base class `Animal` and a subclass `Dog`.

public class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Output: Animal makes a sound

        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks
    }
}
// The `Dog` class extends the `Animal` class and overrides the `makeSound` method.
// This means that anywhere an `Animal` is expected, a `Dog` can be used without affecting the program's correctness.
// For example, if we have a method that takes an `Animal` parameter, we can pass a `Dog` instance to it: