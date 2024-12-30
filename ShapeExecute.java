abstract class Shape {
    protected int dimension1;
    protected int dimension2;

    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {

    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Rectangle: " + (dimension1 * dimension2));
    }
}

class Triangle extends Shape {

    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * dimension1 * dimension2));
    }
}

class Circle extends Shape {
    private static final double PI = 3.14159;

    public Circle(int radius) {
        super(radius, 0);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Circle: " + (PI * dimension1 * dimension1));
    }
}

public class ShapeExecute {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        rectangle.printArea();

        Shape triangle = new Triangle(10, 5);
        triangle.printArea();

        Shape circle = new Circle(7);
        circle.printArea();
    }
}
