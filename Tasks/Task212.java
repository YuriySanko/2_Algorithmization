package Algorithmization;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task212 {
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

        System.out.println("Strings increase :");
//        for (int i=0;i<n;i++) {
//            Arrays.sort(matrix[i]);
//        }

        for (int i=0;i<n;i++){
            for (int s=m-1; s>0; s--){
                for ( int j=0;j<s;j++){
                    if (matrix[i][j]>matrix[i][j+1]){
                        tmp=matrix[i][j];
                        matrix [i][j]=matrix[i][j+1];
                        matrix[i][j+1]=tmp;
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

        System.out.println("Strings decrease :");
        for (int i=0;i<n;i++) {
            Arrays.sort(matrix[i], Collections.reverseOrder());
        }

        for (int i=0;i<n;i++){
            for (int j=0; j<m; j++){

                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }

    }

        
        
}

