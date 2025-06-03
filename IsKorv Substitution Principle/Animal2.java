//this is an example of a violation of the IsKorv Substitution Principle (LSP) in Java.
/*The LSP states that objects of a superclass should be replaceable with objects of a 
subclass without affecting the correctness of the program.*/
// This example demonstrates a class that violates the Liskov Substitution Principle (LSP) in Java.
//base this example on the previous example of the `Animal` and `Dog` classes.

//create a superclass `Animal2` and a subclass `Cat` that violates the LSP.
// The `Cat` class extends the `Animal2` class but introduces a method that is not present in the superclass.

public class Animal2 {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class Cat extends Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    /* This method violates the Liskov Substitution Principle because
    the method is not part of the superclass Animal2. */
    // If we try to use a Cat object where an Animal2 is expected, it may lead to unexpected behavior.
    public void climbTree() {
        System.out.println("Cat climbs a tree");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal2 myAnimal = new Animal2();
        myAnimal.makeSound(); // Output: Animal makes a sound

        Animal2 myCat = new Cat();
        myCat.makeSound(); // Output: Cat meows

        // myCat.climbTree(); this line would cause a compile-time error
        // because climbTree() is not a method of Animal2.
    }
}
