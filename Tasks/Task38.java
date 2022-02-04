package Algorithmization;

import java.util.Scanner;

public class Task38 {
    private static int[] filingArray (int size) {
        int[] array = new int [size];
        for (int i = 0; i <size; i++) {
            array[i]=(int)(Math.random() * 20+1);
            System.out.print("  "+array[i]);
        }
        System.out.println();
        return array;
    }
    private static int common (int[] array) {
        boolean finded=false;

        int max=0;
        for (int element:array) {
            if (element > max) max = element;
        }
        int common=max;

        while (finded==false){
            finded=true;
            for (int element:array) {
                if (common%element!=0) finded=false;
            }
            common++;
        }common--;
        return common;
    }

    private static void sort(int[] array){
        int tmp;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int j=0; j< array.length-1; j++){
                if (array[j]>array[j+1]){
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    needIteration = true;
                }
            }
        }


    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input numbers of fractons:");
        int n = r.nextInt();

        System.out.print("Array of numerators:  ");
        int [] numerators = filingArray(n);
        System.out.print("Array of dominators:  ");
        int [] dominators = filingArray(n);
        double[] fractions = new double[n];

        int commonDominator=common(dominators);
        System.out.print("For fractions: ");
        for (int i=0; i<n; i++) {
            System.out.print(numerators[i]+"/"+dominators[i]+";  ");
        }
        System.out.print("\nCommon dominator: "+commonDominator);

        int [] newNumerators= new int[n];
        for (int i=0; i<n; i++) {
            newNumerators[i]=numerators[i]*commonDominator/dominators[i];
        }

        System.out.print("\nNew fractions: ");
        for (int i=0; i<n; i++) {
            System.out.print(newNumerators[i]+"/"+commonDominator+";  ");
        }

        sort(newNumerators);

        System.out.print("\nSorted new fractions: ");
        for (int i=0; i<n; i++) {
            System.out.print(newNumerators[i]+"/"+commonDominator+";  ");
        }



    }

}
