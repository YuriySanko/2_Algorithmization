package Algorithmization;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input count of numbers:");
        int n = k.nextInt();//reads and assigns count
        System.out.println("Input " + n + "numbers:");
        int[] array = new int[n];
        int min=Integer.MAX_VALUE;
        int count=0;
        for (int i = 0; i < n; i++) {
            array[i] = k.nextInt();
            if (array[i] < min) { // finding a minimum value of array
                min = array[i];
                count = 1;
            }
                else if (array[i] == min) count++; // counting a number of minimum value
        }
        int [] arrayNew = new int[n-count];
        int j=0;
        for (int i = 0; i < n; i++) {
            if (array[i] != min) {  // exclude numbers with min value from array
                System.out.print(array[i]+" ");
                arrayNew[j]=array[i]; // new array without numbers min value
                j++;
            }
        }
    }
}
