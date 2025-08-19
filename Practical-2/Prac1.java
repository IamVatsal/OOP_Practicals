public class Prac1 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);

        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest number: " + num2);
        } else {
            System.out.println("Largest number: " + num3);
        }
    }
}