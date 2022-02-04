package Algorithmization;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input count of numbers:");
        int n = k.nextInt();//reads and assigns count
        System.out.println("Input " + n + "numbers:");
        int [] array = new int[n];
        int [] arrayNew = new int[n];
        int j=0;
        for (int i = 0; i < n; i++) {
            array[i] = k.nextInt();

        }
        for (int i = 0; i < j; i++) System.out.print(arrayNew[i]+" ");

    }
}
