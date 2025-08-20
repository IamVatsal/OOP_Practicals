public class Prac7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Vatsal");
        System.out.println(sb.toString());
        sb.insert(5," My Name is ");
        System.out.println(sb.toString());
        sb.deleteCharAt(5);
        System.out.println(sb.toString());
        sb.replace(0, 5, "Hii ");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
    }
}