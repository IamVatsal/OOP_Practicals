import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Check check = new Check();
        System.out.print("Enter your roll number: ");
        int rollno = scanner.nextInt();
        try {
            check.checkRollno(rollno);
        } catch (InvalidRollno e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Execution of roll number check completed.");
            scanner.close();
        }
    }
    
}

// Custom exception class
class InvalidRollno extends Exception {
    public InvalidRollno(String message) {
        super(message);
    }
}

class Check {
    void checkRollno(int rollno) throws InvalidRollno {
        int maxRollno = 50;
        if (rollno > maxRollno) {
            throw new InvalidRollno("Invalid roll number must be less than or equal to " + maxRollno + ": " + rollno);
        } else {
            System.out.println("Welcome, student with roll number: " + rollno);
        }
    }
}