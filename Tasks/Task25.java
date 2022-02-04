package Algorithmization;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input size of matrix [n] (n- is even):");
        int n = k.nextInt();//reads count of strings
        int [][] matrix = new int[n][n];
        System.out.println("Initial matrix:");
        for (int i=0;i<n;i++){  // filling a matrix
            for (int j=0; j<n; j++){
                if ((i + j)>=n ) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = i + 1;
                }
                System.out.print(" "+ matrix[i][j]);
            }
            System.out.println();
        }
    }
}
