package Algorithmization;

import java.util.Scanner;

public class Task413 {
    public static void twins(int a, int b){
        while ((a+2)<=b){
            System.out.print("("+a+"; "+ (2+a)+") ");
            a+=2;
        }
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input number n:");
        int n= r.nextInt();

        twins(n,2*n);
        twins(n+1,2*n);



    }
}
