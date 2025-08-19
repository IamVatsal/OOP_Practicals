public class Prac12 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        for(int i = 0; i <= num; i++) {
            int count = 1;
            for (int j = 0; j < i; j++) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }
    }
}