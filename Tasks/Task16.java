package Algorithmization;

import java.math.BigInteger;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input count of numbers:");
        int n = k.nextInt();//reads and assigns count
        System.out.println("Input " + n + "numbers:");
        int [] array = new int[n];
        double sum=0;
        for (int i = 0; i < n; i++) {
            array[i] = k.nextInt();
            BigInteger big = BigInteger.valueOf(i+1);
            if (big.isProbablePrime(i+1)) sum+=array[i];
        }
        System.out.println(sum);

    }
}
