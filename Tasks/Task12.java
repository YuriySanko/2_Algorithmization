package Algorithmization;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input count of numbers:");
        int n = k.nextInt();//reads and assigns count
        System.out.println("Input "+n+"numbers:");
        double []array=new double[n];
        for (int i=0; i<n;i++)  array[i] = k.nextDouble();
        System.out.println("Input number Z:");
        Double z = k.nextDouble();   //reads and assigns number Z
        int changes=0;
        for (int i=0; i<n; i++) {
            if (array[i] > z) {
                System.out.print(z + ", ");
                changes++;
            }
            else System.out.print(array[i] + ", ");
        }
        System.out.println("Numbers of changes "+ changes);
    }
}
