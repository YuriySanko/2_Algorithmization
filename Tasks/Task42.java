package Algorithmization;

import java.util.Scanner;

public class Task42 {
    public static int Gcd(int a, int b){
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
        System.out.println("Input four numbers >0 :");
        int a = r.nextInt();
        int b = r.nextInt();
        int c = r.nextInt();
        int d = r.nextInt();

        System.out.println("The greatest common divisor of four numbers is "+Gcd(Gcd(a,b),Gcd(c,d)));


    }
}
