package Algorithmization;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input count of numbers:");
        int n = k.nextInt();//reads and assigns count
        System.out.println("Input "+n+"numbers:");
        double []array=new double[n];
        for (int i=0; i<n;i++)  array[i] = k.nextDouble();
        int positive=0;
        int zero=0;
        int negative=0;
        for (int i=0; i<n; i++) {
            if (array[i] > 0) positive++;
            if (array[i]==0) zero++;
            if (array[i] < 0) negative++;
            }

        System.out.println("Positive numbers "+ positive);
        System.out.println("Zero numbers "+ zero);
        System.out.println("Negative numbers "+ negative);
    }
}
