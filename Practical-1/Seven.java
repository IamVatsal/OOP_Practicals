public class Seven {
    public static void main(String[] args) {
        double base = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double area = 0.5 * base * height;
        System.out.println("Area of a Triangle : " + area);

        double length = Double.parseDouble(args[2]);
        double breadth = Double.parseDouble(args[3]);
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of a Rectangle: " + perimeter);
    }
}
// java Seven.java 5 5 20 50