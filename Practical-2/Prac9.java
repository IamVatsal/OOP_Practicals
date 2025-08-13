public class Prac9 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);
        double num4 = Double.parseDouble(args[3]);

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println("Largest number is: " + num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println("Largest number is: " + num2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println("Largest number is: " + num3);
        } else {
            System.out.println("Largest number is: " + num4);
        }
    }
}