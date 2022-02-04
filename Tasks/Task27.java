package Algorithmization;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input size of matrix [N]:");
        int n = k.nextInt();//reads count of strings
        double [][] matrix = new double[n][n];
        int positive=0;
        System.out.println("Initial matrix:");
        for (int i=0;i<n;i++){  // filling a matrix
            for (int j=0; j<n; j++){
                matrix[i][j]=(double) Math.round(Math.sin( (i*i-j*j)/n)*1000)/1000;
                if (matrix[i][j]>0) positive++;
                System.out.print(" "+ matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Number of positive elements "+ positive);
    }
}
