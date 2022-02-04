package Algorithmization;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input range of array n :");
        int n = k.nextInt();//reads and assigns n range of array
        System.out.println("Input numbers of array A["+n+"] :");
        int []array=new int[n];
        for (int i=0; i<n;i++)  array[i] = k.nextInt();
        System.out.println("Input multiplicity number K:");
        int mult = k.nextInt();   //reads and assigns multiplicity number K
        System.out.println("Numbers of array multiplicity "+ mult+": ");
        for (int i=0; i<n; i++) if (array[i]%mult ==0) System.out.print(array[i]+", ");


    }
}
