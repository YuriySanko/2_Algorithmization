package Algorithmization;

import java.util.Scanner;

public class Task41 {
    public static int gcd(int a, int b){
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input two numbers >0 :");
        int a = r.nextInt();
        int b = r.nextInt();
        System.out.println("For numbers "+a+" and "+b+" the greatest common divisor is "+gcd(a,b));
        System.out.println(("The smallest common multiple is "+a*b/gcd(a,b)));
        int c=(int)1.09;
        System.out.println(c);

    }
}
