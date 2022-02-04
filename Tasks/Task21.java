package Algorithmization;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input size of matrix [n,m]:");
        int n = k.nextInt();//reads count of strings
        int m= k.nextInt(); // reads count of column
        int [][] matrix = new int[n][m];
        System.out.println("Initial matrix:");
        for (int i=0;i<n;i++){  // filling a matrix
            for (int j=0; j<m; j++){
                matrix[i][j]=(int) (Math.random() * 100);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Required matrix:");
        for (int i=0;i<n;i++){
            for (int j=0; j<m; j++){
                if ((j%2==0)&&(matrix[0][j]>matrix[n-1][j])) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
