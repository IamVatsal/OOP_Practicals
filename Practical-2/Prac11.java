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

public class Prac11While {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.print("Prime Numbers (while): ");

        int i = 1;
        while (i <= num) {
            boolean isPrime = true;
            int j = 2;
            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if (isPrime && i > 1) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

public class Prac11DoWhile {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        System.out.print("Prime Numbers (do-while): ");

        int i = 1;
        do {
            boolean isPrime = true;
            int j = 2;
            do {
                if (j <= Math.sqrt(i) && i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            } while (j <= Math.sqrt(i));

            if (isPrime && i > 1) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= num);
    }
}
