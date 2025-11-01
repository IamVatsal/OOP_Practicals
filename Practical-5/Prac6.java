
public class Prac6 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.area();

        Shape rectangle = new Rectangle(10, 20);
        rectangle.area();

        Shape triangle = new Triangle(15, 10);
        triangle.area();
    }
}

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}