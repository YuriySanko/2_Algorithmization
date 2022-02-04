package Algorithmization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task214 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input size of matrix [n,m](n>m):");
        int n = k.nextInt();//reads count of strings
        int m = k.nextInt(); // reads count of column
        Integer[][] matrix = new Integer[n][m];
        if (m>n) {System.out.println("Incorrect input value");
        System.exit(0);}
        System.out.println("Initial matrix:");
        for (int i = 0; i < n; i++) {  // filling a matrix
            for (int j = 0; j < m; j++) {
                if (i<=j) matrix[i][j]=1;
                else matrix[i][j]=0;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                arrayList.add(matrix[i][j]);
            }
            Collections.shuffle(arrayList);
            for (int i = 0; i < n; i++) {
                matrix[i][j] = arrayList.get(i);
            }
            arrayList.clear();
        }
        System.out.println("New matrix:");

        for (int i = 0; i < n; i++) {  // New matrix
            for (int j = 0; j < m; j++) {
               System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
