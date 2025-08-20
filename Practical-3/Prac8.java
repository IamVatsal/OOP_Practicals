import java.util.Scanner;
public class Prac8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String:");
        String str = scanner.nextLine();
        String[] splitedArr = str.split("\\s+");
        int size = splitedArr.length;
        System.err.print("Words in Reversed: ");
        for(int i = size - 1; i >= 0; i--){
            System.out.print(splitedArr[i]+" ");
        }
        scanner.close();
    }
}