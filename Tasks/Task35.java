package Algorithmization;

import java.util.Scanner;

public class Task35 {

    private static int Searching (int[] array, int lastIndex, int element){
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if ( j != 0) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input size of sequence n:");
        int n = r.nextInt();
        int [] array= new int[n];

        System.out.print("Sequence:  ");
        for (int i = 0; i < n; i++) {
            array[i]=(int) (Math.random() * 50);
            System.out.print(array[i]+"  ");
        }

        int temp;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                int j = Searching(array, i, array[i + 1]);
                for (int k = i + 1; k > j; k--) {
                    array[k] = array[k - 1];
                }
                array[j] = temp;
            }
        }




        System.out.print("\nSorting sequence: ");
        for (int elment:array)
        {
            System.out.print(elment+"  ");

        }


    }



}
