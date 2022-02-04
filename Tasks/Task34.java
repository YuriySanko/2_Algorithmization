package Algorithmization;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input size of sequence n:");
        int n = r.nextInt();
        int [] sequence= new int[n];
        int step1 = (int) (Math.random() * 10+1);
        int a=(int) (Math.random() * 5);
        System.out.print("Sequence:  ");
        for (int i = 0; i < n; i++) {
            sequence[i]=(a+step1*i);
            System.out.print(sequence[i]+"  ");
        }


        int tmp;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int j=0; j<n-1; j++){
                if (sequence[j]<sequence[j+1]){
                    tmp=sequence[j];
                    sequence [j]=sequence[j+1];
                    sequence[j+1]=tmp;
                    needIteration = true;
                }
            }
        }

        System.out.print("\nSorting sequence: ");
        for (int elment:sequence)
        {
            System.out.print(elment+"  ");

        }
    }
}
