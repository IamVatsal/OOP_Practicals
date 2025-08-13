public class Prac2{
public static void main(String[] args){
    int num1[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int num2[][] = {{10,11,12},{13,14,15},{16,17,18}};
    
    System.out.print("2D Array 1:\n");
    for(int i = 0; i < num1.length; i++){
        for(int j = 0; j < num1[i].length; j++){
            System.out.print(num1[i][j] + " ");
        }
        System.out.println();
    }

    System.out.print("2D Array 2:\n");
    for(int i = 0; i < num2.length; i++){
        for(int j = 0; j < num2[i].length; j++){
            System.out.print(num2[i][j] + " ");
        }
        System.out.println();
    }

    // transpose
    System.out.print("2D Array 1 Transpose:\n");
    for(int i = 0; i < num1[0].length; i++){
        for(int j = 0; j < num1.length; j++){
            System.out.print(num1[j][i] + " ");
        }
        System.out.println();
    }

    System.out.print("2D Array 2 Transpose:\n");
    for(int i = 0; i < num2[0].length; i++){
        for(int j = 0; j < num2.length; j++){
            System.out.print(num2[j][i] + " ");
        }
        System.out.println();
    }
}}