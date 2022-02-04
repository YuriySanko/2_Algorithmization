package Algorithmization;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input size of matrix [n,m]:");
        int n = k.nextInt();//reads count of strings
        int m= k.nextInt(); // reads count of column
        int [][] matrix = new int[n][m];
        int [][] matrixNew = new int[n][m];
        System.out.println("Initial matrix:");
        for (int i=0;i<n;i++){  // filling a matrix
            for (int j=0; j<m; j++){
                matrix[i][j]=(int) (Math.random() * 100);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Input numbers of columns to change:");
        int column1 = k.nextInt();//reads number of column1
        int column2= k.nextInt(); // reads number of column1
        System.out.println("Matrix wit changed columns:");

        for (int i=0;i<n;i++){  // filling a new matrix
            for (int j=0; j<m; j++){
                if (j==column1-1) matrixNew[i][j]=matrix[i][column2-1];
                    else if (j==column2-1) matrixNew[i][j]=matrix[i][column1-1];
                            else matrixNew[i][j]=matrix[i][j];
                System.out.print(matrixNew[i][j]+" ");
            }
            System.out.println();
        }
    }
}
