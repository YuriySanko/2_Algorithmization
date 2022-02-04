package Algorithmization;

import java.util.Scanner;

public class Task215 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input size of matrix [n,m]:");
        int n = k.nextInt();//reads count of strings
        int m = k.nextInt(); // reads count of column
        int max=0;
        Integer[][] matrix = new Integer[n][m];
        System.out.println("Initial matrix:");
        for (int i = 0; i < n; i++) {  // filling a matrix
            for (int j = 0; j < m; j++) {
                matrix[i][j]=(int) (Math.random() * 10);
                System.out.print(matrix[i][j]+"  ");
                if (max<matrix[i][j]) max=matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("New matrix: ");
        for (int i = 0; i < n; i++) {  // New matrix
            for (int j = 0; j < m; j++) {
                if (matrix[i][j]%2!=0) matrix[i][j]=max;
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

    }

}
