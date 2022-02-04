package Algorithmization;

import java.util.Scanner;

public class Task48 {
    public static void sumThreeNumbers(double[] array){
        System.out.println("\nInput numbers of elements to sum:");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int m =scan.nextInt();
        for (int i=k;i<=m-2;i++){
           double sum=0;
           for (int j=i;j<i+3;j++){
               sum+=array[j];
           }
           System.out.printf("\nSum elements of array from %d to %d is %f",i,i+2,sum);
       }

    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input size of array n:");
        int n = r.nextInt();

        double array [] = new double[n];
        Task36 arrayNew= new Task36();
        array=arrayNew.randomArray(n);
        sumThreeNumbers(array);

    }
}
