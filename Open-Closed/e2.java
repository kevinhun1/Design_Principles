
//in this example we will violate the Open/Closed Principle (OCP) in Java.
// The `Shape` class is not open for extension and requires modification to add new shapes.
public class e2{
    private String type;
    private double dimension1;
    private double dimension2;

    public e2(String type, double dimension1, double dimension2) {
        this.type = type;
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double area() {
        if (type.equals("Circle")) {
            return Math.PI * dimension1 * dimension1; // Assuming dimension1 is radius
        } else if (type.equals("Rectangle")) {
            return dimension1 * dimension2; // Assuming dimension1 is width and dimension2 is height
        }
        return 0; // Default case
    }

    public void printDetails() {
        System.out.println(type + " with dimensions: " + dimension1 + ", " + dimension2 + ", Area: " + area());
    }
}