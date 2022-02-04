package Algorithmization;

import java.util.Scanner;

public class Task23 {
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
        System.out.println("Input number k string of matrix:");
        int str = k.nextInt();//reads number k strings
        for (int j=0;j<m;j++){
            System.out.print(matrix[str-1][j] + " ");
                }
        System.out.println();
        System.out.println("Input number k string of matrix:");
        int column= k.nextInt(); // reads number column
        for (int i=0;i<m;i++){
            System.out.print(matrix[i][column-1] + " ");
            System.out.println();
        }
    }
}
