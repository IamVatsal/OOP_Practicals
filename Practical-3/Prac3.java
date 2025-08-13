public class Prac3{
public static void main(String[] args){
    double num[] = new double[args.length];
    for(int i = 0; i < args.length; i++){
        num[i] = Double.parseDouble(args[i]);
    }
    double largest = num[0];
    double secondLargest = Double.NEGATIVE_INFINITY;
    for(int i = 1; i < num.length; i++){
        if(num[i] > largest){
            secondLargest = largest;
            largest = num[i];
        } else if(num[i] > secondLargest && num[i] < largest) {
            secondLargest = num[i];
        }
    }
    System.out.println("Largest Element: " + largest);
    System.out.println("Second Largest Element: " + secondLargest);
}}