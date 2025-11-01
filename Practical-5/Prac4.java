import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        NumberArray numberArray = new NumberArray(5, 5);
        numberArray.readNumbers();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number to search: ");
        String input = scanner.next();
        if (input.contains(".")) {
            float searchFloat = Float.parseFloat(input);
            System.out.println("Occurrences of " + searchFloat + ": " + numberArray.countOccurrences(searchFloat));
        } else {
            int searchInt = Integer.parseInt(input);
            System.out.println("Occurrences of " + searchInt + ": " + numberArray.countOccurrences(searchInt));
        }
    }
}

class NumberArray {
    int[] intArray;
    float[] floatArray;

    NumberArray(int intSize, int floatSize) {
        this.intArray = new int[intSize];
        this.floatArray = new float[floatSize];
    }

    void readNumbers() {
        readNumbers(intArray);
        readNumbers(floatArray);
    }

    void readNumbers(int[] intArray) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter " + intArray.length + " integers:");
        for (int i = 0; i < intArray.length; i++) {
            this.intArray[i] = scanner.nextInt();
        }
    }

    void readNumbers(float[] floatArray) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter " + floatArray.length + " floating point numbers:");
        for (int i = 0; i < floatArray.length; i++) {
            this.floatArray[i] = scanner.nextFloat();
        }
    }

    int countOccurrences(int number) {
        int count = 0;
        for (int num : this.intArray) {
            if (num == number) {
                count++;
            }
        }
        return count;
    }

    int countOccurrences(float number) {
        int count = 0;
        for (float num : this.floatArray) {
            if (Float.compare(num, number) == 0) {
                count++;
            }
        }
        return count;
    }
}