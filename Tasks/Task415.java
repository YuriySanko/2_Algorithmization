package Algorithmization;

import java.util.Scanner;

public class Task415 {
    public static void increaseSequence (int n){
        if ((n>1)&&(n<10)) {
            for (int i=1; i<=10-n;i++) {
                int increaseNumber=0;
                int firstDigit=i;
                for (int j=n-1; j>=0;j--){
                    increaseNumber += firstDigit*Math.pow(10,j);
                    firstDigit++;
                }
                System.out.print(increaseNumber+"  ");

            }

        }
        else System.out.println("There aren't any increasing sequence ");


    }
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input number n:");
        int n= r.nextInt();

        increaseSequence(n);

    }
}
