package Algorithmization;

import java.util.Scanner;

public class Task411 {
    public static void moreDigits(int n, int m){
        String numberN= Integer.toString(n);
        String numberM = Integer.toString(m);
        if (numberN.length()>numberM.length()) {
            System.out.printf("\nNumber %d has more digits than %d",n,m);
        }

        else {
            if (numberN.length()==numberM.length()) {
                System.out.printf("\nThe numbers %d and  %d have a same count of digits",n,m);
            }
            else System.out.printf("\nNumber %d has more digits than %d",m,n);
        }

    }
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input two numbers:");
        int a= r.nextInt();
        int b= r.nextInt();
        moreDigits(a,b);

    }

}
