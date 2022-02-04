package Algorithmization;

import java.util.Scanner;

public class Task417 {
    public static int deductDigits(int number) {
        String digits = Integer.toString(number);
        number-=digits.length();
        return number;
    }

    public static int findingIterations( int number){
        int iterations=0;
        while (number>0){
            number=deductDigits(number);
            iterations++;
            System.out.print(number+" ");
        }
        return iterations;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input number:");
        int number= r.nextInt();
        System.out.printf("\nNumber of iterations to get zero is "+findingIterations(number));
    }
}
