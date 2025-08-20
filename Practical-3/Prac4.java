public class Prac4{
public static void main(String[] args){
    int num1[] = {1,2,3,4,5,6,7,8,9};
    int num2[] = {10,11,12,13,14,15,16,17,18};

    System.out.print("1D Array 1:\n");
    for(int i = 0; i < num1.length; i++){
        System.out.print(num1[i] + " ");
    }
    System.out.println();

    System.out.print("1D Array 2:\n");
    for(int i = 0; i < num2.length; i++){
        System.out.print(num2[i] + " ");
    }
    System.out.println();

    int merged[] = new int[num1.length + num2.length];
    int k = 0;
    for(int i = 0; i < num1.length; i++){
        merged[k++] = num1[i];
    }
    for(int i = 0; i < num2.length; i++){
        merged[k++] = num2[i];
    }

    System.out.print("Merged Array:\n");
    for(int i = 0; i < merged.length; i++){
        System.out.print(merged[i] + " ");
    }
    System.out.println();

    System.out.print("Merged Array (Sorted):\n");
    for(int i = 0; i < merged.length - 1; i++){
        for(int j = i + 1; j < merged.length; j++){
            if(merged[i] > merged[j]){
                int temp = merged[i];
                merged[i] = merged[j];
                merged[j] = temp;
            }
        }
    }
    for(int i = 0; i < merged.length; i++){
        System.out.print(merged[i] + " ");
    }
    System.out.println();
}}