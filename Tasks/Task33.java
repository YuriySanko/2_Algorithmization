package Algorithmization;

import java.util.Scanner;

public class Task33 {
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
        for (int i=0;i<n;i++){
            for (int j=i; j<n; j++){
                 if (sequence[j]>sequence[i]){
                        tmp=sequence[i];
                        sequence [i]=sequence[j];
                        sequence[j]=tmp;
                    }

            }
        }
        System.out.println();
        System.out.print("Sorting sequence: ");
        for (int elment:sequence)
             {
                 System.out.print(elment+"  ");

        }
    }

}
