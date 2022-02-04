package Algorithmization;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input size of matrix [n,m]:");
        int n = k.nextInt();//reads count of strings
        int m= k.nextInt(); // reads count of column
        int [][] matrix = new int[n][m];
        int [][] matrixNew = new int[n][m];
        int [] sumColumn= new int[m];
        int maxSumColumn = 0;
        int columnMax=0;
        System.out.println("Initial matrix:");
        for (int i=0;i<n;i++){  // filling a matrix
            for (int j=0; j<m; j++){
                matrix[i][j]=(int) (Math.random() * 10);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Sum of column: ");
        for (int j=0;j<m;j++){  // counting sum of column
            for (int i=0; i<n; i++){
                sumColumn[j]+=matrix[i][j];
            }
            System.out.print(sumColumn[j]+" ");
            if (maxSumColumn<sumColumn[j]) {
                maxSumColumn=sumColumn[j];
                columnMax=j+1;
            }
        }
        System.out.println();
        System.out.println("Maximum sum column is "+maxSumColumn+" in "+(columnMax)+" column");
    }
}
