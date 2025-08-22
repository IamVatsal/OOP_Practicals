public class Prac8{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        System.out.println("Number: " + num);
        System.out.print("Factors: ");
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(num);
    }
}