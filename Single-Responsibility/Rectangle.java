// This example demonstrates a class that violates the Single Responsibility Principle (SRP) in Java.
// The class has two responsibilities: 
// calculating the area and displaying the details of the rectangle.
public class  Rectangle{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    // A second responsibility: displaying details
    public void printDetails() {
        System.out.println("Width: " + width + ", Height: " + height + ", Area: " + area());
    }
}
