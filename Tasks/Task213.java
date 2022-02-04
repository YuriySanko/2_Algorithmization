package Algorithmization;

import java.util.Scanner;

public class Task213 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input size of matrix [n,m]:");
        int n = k.nextInt();//reads count of strings
        int m= k.nextInt(); // reads count of column
        Integer [][] matrix = new Integer[n][m];
        int tmp;
        System.out.println("Initial matrix:");
        for (int i=0;i<n;i++){  // filling a matrix
            for (int j=0; j<m; j++){
                matrix[i][j]=(int) (Math.random() * 10);
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Columns increase :");

        for (int j=0;j<m;j++){
            for (int s=n-1; s>0; s--){
                for ( int i=0;i<s;i++){
                    if (matrix[i][j]>matrix[i+1][j]){
                        tmp=matrix[i][j];
                        matrix [i][j]=matrix[i+1][j];
                        matrix[i+1][j]=tmp;
                    }
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Columns decrease :");
        for (int j=0;j<m;j++){
            for (int s=n-1; s>0; s--){
                for ( int i=0;i<s;i++){
                    if (matrix[i][j]<matrix[i+1][j]){
                        tmp=matrix[i][j];
                        matrix [i][j]=matrix[i+1][j];
                        matrix[i+1][j]=tmp;
                    }
                }
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0; j<m; j++){

                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

    }



}
