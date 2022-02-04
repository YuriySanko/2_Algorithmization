package Algorithmization;

import java.util.Scanner;

public class Task210 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input size of square matrix N:");
        int n = k.nextInt();//reads count of strings
        int [][] matrix = new int[n][n];
        int [] positiveDiag=new int [n];
        int d=0;

        System.out.println("Initial matrix:");
        for (int i=0;i<n;i++){  // filling a matrix
            for (int j=0; j<n; j++){
                matrix[i][j]=(int) (-5+Math.random() * 10);
                System.out.print(matrix[i][j]+"  ");
                if ((i==j)&&(matrix[i][j]>0)){
                    positiveDiag[d]=matrix[i][j];
                    d++;
                }
            }
            System.out.println();
        }
        System.out.print("Positive elements of diagonal are: " );
        for (d=0;d< positiveDiag.length;d++) {
            System.out.print(positiveDiag[d] + " ");
        }
    }
}
