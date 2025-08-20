import java.util.Scanner;
public class Prac5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String:");
        String str = scanner.nextLine();
        int st = 0,end = str.length() - 1;
        while(st < end){
            if (str.charAt(st) != str.charAt(end)) {
                System.out.println("String is Not Palindrome");
                scanner.close();
                return;
            } else {
            }
            st++;
            end--;
        }
        System.out.println("String is Palindrome");
        scanner.close();
    }
}