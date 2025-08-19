public class Prac2 {
    public static void main(String[] args) {
        float num1 = Float.parseFloat(args[0]);
        float num2 = Float.parseFloat(args[1]);

        System.err.println("Sum: " + (num1 + num2));
        System.err.println("Difference: " + (num1 - num2));
        System.err.println("Product: " + (num1 * num2));
        System.err.println("Quotient: " + (num1 / num2));
        System.err.println("Modulus: " + (num1 % num2));
    }
}