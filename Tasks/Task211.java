package Algorithmization;

import java.util.Scanner;

public class Task211 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int [][] matrix = new int[10][20];
        int [] numbersStrings=new int [10];
        int d=0;

        System.out.println("Initial matrix:");
        for (int i=0;i<10;i++){  // filling a matrix
            int count=0;
            for (int j=0; j<20; j++){
                matrix[i][j]=(int) (Math.random() * 15);
                System.out.print(matrix[i][j]+"  ");
                if (matrix[i][j]==5) count++;
            }
            if (count>=3) {
                numbersStrings[d]=i+1;
                d++;
            }System.out.println();
        }

            System.out.print("Strings which  have 5 more then 3 times: " );

            for (int num:numbersStrings)
                 if (num!=0) System.out.print(num+", ");

    }
}
