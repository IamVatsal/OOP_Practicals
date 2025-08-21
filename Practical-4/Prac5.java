public class Prac5 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of circle: " + shape.calculateArea(5.0));
        System.out.println("Area of square: " + shape.calculateArea(4));
        System.out.println("Area of rectangle: " + shape.calculateArea(4, 6));
    }
}

class Shape {
    // Area of circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    // Area of square
    public double calculateArea(int side) {
        return side * side;
    }
    // Area of rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }
}