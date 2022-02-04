package Algorithmization;

import java.util.Arrays;
import java.util.Scanner;


public class Task410 {
    public static int [] arrayDigits (int n){
        String numberStr= Integer.toString(n);
        int [] array =new int [numberStr.length()];
        for (int i=numberStr.length()-1; i>=0;i--){
            array[i]=n%10;
            n=(int) (n/10);
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input number:");
        int number= r.nextInt();
        System.out.println(Arrays.toString(arrayDigits(number)));
    }

}
