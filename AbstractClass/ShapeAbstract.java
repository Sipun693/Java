package AbstractClass;

abstract class Shape {
    // Instance variables for length, breadth, and radius
    int length;
    int breadth;

    // Constructor to initialize length and breadth
    public Shape(int l, int b) {
        length = l;
        breadth = b;
    }

    // Abstract methods for area and perimeter
    abstract double area();

    abstract double perimeter();
}

class Rectangle extends Shape {

    // Constructor to initialize length and breadth for Rectangle
    public Rectangle(int l, int b) {
        super(l, b); // Call the superclass constructor to set length and breadth
    }

    @Override
    public double area() {
        return length * breadth; // Area of rectangle = length * breadth
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth); // Perimeter of rectangle = 2 * (length + breadth)
    }
}

class Circle extends Shape {
    double radius;

    // Constructor to initialize radius for Circle
    public Circle(int radius) {
        super(0, 0); // We don't need length and breadth for Circle, so pass 0
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // Area of circle = π * radius²
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // Perimeter (circumference) of circle = 2 * π * radius
    }
}

public class ShapeAbstract {
    public static void main(String[] args) {
        // Creating Rectangle and Circle objects
        Shape s1 = new Rectangle(5, 4); // Rectangle with length 5 and breadth 4
        Shape s2 = new Circle(7); // Circle with radius 7

        // Calculating and displaying area and perimeter of Rectangle
        System.out.println("Rectangle Area: " + s1.area());
        System.out.println("Rectangle Perimeter: " + s1.perimeter());

        // Calculating and displaying area and perimeter of Circle
        System.out.println("Circle Area: " + s2.area());
        System.out.println("Circle Perimeter: " + s2.perimeter());
    }
}
