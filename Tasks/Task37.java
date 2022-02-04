package Algorithmization;

import java.util.Scanner;

public class Task37 {

    private static double[] filingArray () {
        Scanner r = new Scanner(System.in);
        System.out.println("Input size of sequence:");
        int size = r.nextInt();
        double[] sequence = new double[size];
        double step = Math.random() * 10;
        double a= Math.random() * 5;

        System.out.print("Sequence:  ");
        for (int i = 0; i <size; i++) {
            sequence[i]=(a+step*i);
            System.out.printf("%.2f" + "  ",sequence[i]);
        }
        System.out.println();
        return sequence;
    }

    public static void main(String[] args) {
        double [] sequenceA = filingArray();
        double [] sequenceB = filingArray();
        double[] sequenceNew = new double[sequenceA.length+ sequenceB.length];
        int i=0;
        int j=0;
        boolean indexLastA=true;
        boolean indexLsatB=true;

        for (int k=0; k< sequenceNew.length;k++){
            if ((sequenceA[i]>sequenceB[j])&(indexLsatB)) {
                sequenceNew[k]=sequenceB[j];
                System.out.println("Element "+Math.round(sequenceB[j]* 100.0) / 100.0+" paste before "+Math.round(sequenceA[i]* 100.0) / 100.0);
                j++;
                if (j==sequenceB.length){
                    indexLsatB=false;
                    j--;
                    while (i< sequenceA.length){
                        k++;
                        sequenceNew[k]=sequenceA[i];
                        i++;
                    }
                }
            }

            else {
                if (indexLastA) {
                    sequenceNew[k]=sequenceA[i];
                    i++;
                }

                if (i==sequenceA.length) {
                    indexLastA=false;
                    i--;
                    while (j< sequenceB.length){
                        k++;
                        sequenceNew[k]=sequenceB[j];
                        System.out.println("Element " + Math.round(sequenceB[j] * 100.0) / 100.0 + " paste after " + Math.round(sequenceA[i] * 100.0) / 100.0);
                        j++;
                    }
                }
           }

        }

        for (double value : sequenceNew) {
            System.out.printf("%.2f"+"  ",value);
        }


    }

}
