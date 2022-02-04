package Algorithmization;

import java.util.Scanner;

public class Task43 {
    public static double squareRectangle(int a){
        double square=Math.pow(a,2)*Math.pow(3,0.5)/4;
        return square;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input value side of regular hexagon:");
        int a = r.nextInt();

        System.out.printf("The square of hexagon with side "+a+" is "+"%.2f",6*squareRectangle(a));

    }
}
