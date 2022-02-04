package Algorithmization;

import java.util.Scanner;

public class Task47 {
    public static int sumOddFactorial(int number){
        int sum=0;
        for (int i=1; i<=number; i+=2){
            int factorial=1;
            for (int j=1; j<=i; j++){
                factorial*=j;
            }
            sum+=factorial;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input numbers >0 :");
        int n = r.nextInt();
        System.out.printf("Sum of odd number factorial %d is %d",n,sumOddFactorial(n));
    }
}
