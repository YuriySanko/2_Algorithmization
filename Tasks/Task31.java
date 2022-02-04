package Algorithmization;

import java.util.Scanner;


public class Task31 {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input sizes of arrays n, m:");
        int n = r.nextInt();
        int m = r.nextInt();
        Integer[] array1 = new Integer[n];
        Integer[] array2 = new Integer[m];
        System.out.println("Input number k (k<n):");
        int k = r.nextInt();
        System.out.print("First array:  ");
        for (int i = 0; i < n; i++) {
            array1[i]=(int) (Math.random() * 50);
            System.out.print(array1[i]+"  ");
        }
        System.out.print("Second array:  ");
        for (int i = 0; i < m; i++) {
            array2[i]=(int) (Math.random() * 50);
            System.out.print(array2[i]+"  ");
        }

        System.out.println("\n\nResult of combining two arrays : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + ", ");
            if (k == i+1) {
                for (int j = 0; j < m; j++) {
                    System.out.print(array2[j] + ", ");
                }
            }

        }
    }
}
