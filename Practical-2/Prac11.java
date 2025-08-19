public class Prac11 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.print("Prime Number: ");
        for (int i = 1; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) {
                System.out.print(i + " ");
            }
        }
    }
}