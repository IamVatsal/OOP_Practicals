public class Prac14 {
    public static void main(String[] args) {
        double a = 5;
        double b = 2.5;
        double c = 4.0;
        System.out.println("a + b * c = " + (a + b * c));
        // first b * c will be evaluated cause of * > + operator precedence
        System.out.println("++a * b - c = " + (++a * b - c));
        // first ++a will be evaluated, then * and - will be applied
        System.out.println("a / b + c = " + (a / b + c));
        // first / will be evaluated, then + will be applied
    }
}