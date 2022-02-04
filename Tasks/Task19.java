package Algorithmization;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input count of numbers:");
        int n = k.nextInt();//reads and assigns count
        System.out.println("Input " + n + "numbers:");
        int[] array = new int[n];
        int[] arrayRep=new int[n];
       // int i;
        int rep=0;
        int position=0;
        for (int i = 0; i < n; i++) array[i] = k.nextInt();

        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                if(array[i]==array[j]) rep++; // Сounting the number repetitions
            }arrayRep[i]=rep; rep=0; // Filling a new array by counting
        }

        for(int i=0;i<n;i++) {
            if(arrayRep[i]==1) rep++; // Check whether there are repetitions
        }
        if(rep==n) System.out.println("There are no repetitions");

        else {
            int maxRep=arrayRep[0];
            for(int i=0;i<n;i++) {
                if(maxRep<arrayRep[i]) {maxRep=arrayRep[i]; position=i;} // Finding a maximum of repetitions
            }

            int countMaxRep=0;
            for(int i=0;i<n;i++) {
                if(maxRep==arrayRep[i]) {countMaxRep++;}// Countig a number of maximum repetitions
            }
            if(countMaxRep==1) System.out.println("Number "+array[position]+" is in array " + maxRep+" times");

            else {
                int min=array[position];
                for(int i=0;i<n ;i++) {
                    if (arrayRep[i] == maxRep) {
                        if (array[i] < min) min = array[i];  // Finding a minimum value of array with maximum repetitions
                    }
                }
                System.out.println("Number "+min+" is in array " + maxRep+" times");
            }
        }
    }
}
