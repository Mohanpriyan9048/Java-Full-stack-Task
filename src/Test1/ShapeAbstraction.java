package Test1;
public class ShapeAbstraction {
    public static void main(String[] args) {
        Shape myCircle = new Circle(5.0); 
        Shape myRectangle = new Rectangle(4.0, 6.0); 
        System.out.println("Circle Area (Radius 5.0): " + myCircle.calculateArea());
        System.out.println("Rectangle Area (4.0 x 6.0): " + myRectangle.calculateArea());
    }
}
abstract class Shape {
    public abstract double calculateArea();
}
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
