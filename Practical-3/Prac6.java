import java.util.Scanner;
public class Prac6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String:");
        String str = scanner.nextLine();
        int vowels = 0, consonants = 0, digit = 0, specialChar = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digit++;
            } else {
                specialChar++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digit);
        System.out.println("Special Characters: " + specialChar);
        scanner.close();
    }
}