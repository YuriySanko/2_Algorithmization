package Algorithmization;

import java.util.Scanner;

public class Task36 {
    public static void sortingShell(double[] array){
        double temp;
        int i = 0;
        while (i < array.length-1) {
            if (array[i ] > array[i+1]) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        System.out.print("\nSorted array:  ");
        for (double value : array) {
            System.out.printf("%.2f"+"  ",value);
        }
    }

    public static double [] randomArray (int n){
        double [] array = new double[n];
        System.out.print("Array:  ");
        for (int i = 0; i < n; i++) {
            array[i]= Math.random()*50;
            System.out.printf("%.2f"+"  ", array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input size of sequence n:");
        int n = r.nextInt();
        double [] array= new double[n];

        array=randomArray(n);

        sortingShell(array);
    }
}
