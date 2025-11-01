import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        Box box = new Box();
        double volume = box.calculateVolume();
        System.out.println("Volume of the box: " + volume);
    }
}


class Box {
    private double length;
    private double width;
    private double height;

    public Box() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter length of the box: ");
        this.length = scanner.nextDouble();
        System.out.print("Enter width of the box: ");
        this.width = scanner.nextDouble();
        System.out.print("Enter height of the box: ");
        this.height = scanner.nextDouble();
    }

    public double calculateVolume() {
        return length * width * height;
    }
}