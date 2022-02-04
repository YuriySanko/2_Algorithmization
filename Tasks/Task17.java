package Algorithmization;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input count of numbers:");
        int n = k.nextInt();//reads and assigns count
        System.out.println("Input " + n + "numbers:");
        double []array = new double[n];
        for (int i = 0; i < n; i++) array[i] = k.nextDouble();
        double maxSum=array[0]+array[array.length-1];
        for (int i = 0; i < array.length/2; i++) {
            if ((array[i]+array[array.length-i-1])>maxSum) maxSum=array[i]+array[array.length-i-1];
        }
        System.out.println(maxSum);

    }

}
