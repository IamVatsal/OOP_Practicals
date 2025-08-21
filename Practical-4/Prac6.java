public class Prac6 {
    public static void main(String[] args) {
        System.out.println("Maximum of 5 and 10 is: " + Max.findMax(5, 10));
        System.out.println("Maximum of 5, 10 and 15 is: " + Max.findMax(5, 10, 15));
        System.out.println("Maximum of 15.5 and 40.6 is: " + Max.findMax(15.5,40.6));
    }
}

class Max{
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }
    public static int findMax(int a, int b, int c) {
        return findMax(findMax(a, b), c);
    }
    public static double findMax(double a, double b) {
        return (a > b) ? a : b;
    }
}