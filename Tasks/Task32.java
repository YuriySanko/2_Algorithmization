package Algorithmization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input sizes of sequences n, m:");
        int n = r.nextInt();
        int m = r.nextInt();

        int step1 = (int) (Math.random() * 10+1);
        int step2 = (int) (Math.random() * 10+1);
        int a=(int) (Math.random() * 5);
        int b=(int) (Math.random() * 5);
        ArrayList<Integer> sequence1List = new ArrayList<>();
        ArrayList<Integer> sequence2List = new ArrayList<>();

        System.out.print("First sequence:  ");
        for (int i = 0; i < n; i++) {
            sequence1List.add(a+step1*i);
        }
        System.out.print(sequence1List);


        System.out.print("\nSecond sequence:  ");
        for (int j = 0; j < m; j++) {
            sequence2List.add(b+step2*j);
        }
        System.out.print(sequence2List);

        System.out.print("\nResult of combining two sequences: ");
        sequence1List.addAll(n, sequence2List);
        Collections.sort(sequence1List);
        System.out.print(sequence1List);

    }
}
