public class Prac1{
public static void main(String[] args){
    double num[] = new double[args.length];
    for(int i = 0; i < args.length; i++){
        num[i] = Double.parseDouble(args[i]);
    }

    // for sum of array
    double sum = 0;
    for(int i = 0; i < num.length; i++){
        sum += num[i];
    }
    System.out.println("Sum: " + sum);

    // for average of array
    double average = sum / num.length;
    System.out.println("Average: " + average);
}}