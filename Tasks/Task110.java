package Algorithmization;

import java.util.Scanner;
public class Task110 {

     public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input count of numbers:");
        int n = k.nextInt();//reads and assigns count
        System.out.println("Input " + n + " numbers:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = k.nextInt();

        int j = 0;
        System.out.print("Compressed array: ");
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                array[j] = array[i];
                System.out.print(array[i]+" ");
                j++;
            }
        }
        for (int i=0; i<n/2;i++) array[n-i-1]=0;

        System.out.println();
        System.out.print("Compressed array with zero: ");
        for (int i = 0; i < n; i++) System.out.print(array[i] + " ");



    }
}
