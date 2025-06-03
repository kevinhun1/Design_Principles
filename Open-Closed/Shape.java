//this example demonstrates the Open/Closed Principle (OCP) in Java.
// The `Shape` class is open for extension but closed for modification.
public abstract class Shape {
    // Abstract method to calculate area
    public abstract double area();

    // Abstract method to display details
    public abstract void printDetails();
}
// This class extends Shape and provides implementation for a Circle
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printDetails() {
        System.out.println("Circle with radius: " + radius + ", Area: " + area());
    }
}
// This class extends Shape and provides implementation for a Rectangle
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void printDetails() {
        System.out.println("Rectangle with width: " + width + ", height: " + height + ", Area: " + area());
    }
}


