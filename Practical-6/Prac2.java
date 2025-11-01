public class Prac2 {
    public static void main(String[] args) {
        try {

            // Nested try block
            try {
                int[] arr = new int[5];
                System.out.println(arr[10]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index is out of bounds.");
            }

            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}
