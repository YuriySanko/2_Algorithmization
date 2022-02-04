package Algorithmization;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input size of sequence n:");
        int n = r.nextInt();
        double array [] = new double[n];

        Task36 arraySort= new Task36();
        array=arraySort.randomArray(n);
        arraySort.sortingShell(array);

        System.out.printf("\nSecond element of the sorted array %.2f",array[1]);

    }
}
