package Algorithmization;

import java.util.Scanner;

public class Task416 {
    public static long sumOddNumbers(int n){
        long sum=0;
        if ((n>1)&&(n<10)) {

            int quantity = (int)Math.pow(5,n);
            int [] arrayOddDigitsNumber= new int[quantity];
            int oddNumber=1;
            for (int i = 1; i < n; i++) {
                oddNumber += (int) Math.pow(10, i);
            }
            arrayOddDigitsNumber[0] = oddNumber;
            System.out.print(arrayOddDigitsNumber[0]+" ");
            int i=1;
            while (i<quantity) {
                oddNumber +=2;
                while (checkOddNumber(oddNumber,n)==false){
                    oddNumber +=2;
                }
                arrayOddDigitsNumber[i]=oddNumber;
                if (i%40==0) System.out.println();
                System.out.print(arrayOddDigitsNumber[i]+" ");
                sum+=arrayOddDigitsNumber[i];
                i++;
            }
        }return sum;
    }
    public static boolean checkOddNumber(int number, int n){
        boolean odd=true;
        int i=n;
        while (i>0){
            if (number%2==0){
                odd=false;
                break;
            }
            else
            {
                number/=10;
                i--;
            }
        }
        return odd;
    }
    public static int oddDigits (long number){
        int count =0;

        while (number>1){
            if (number%2==0){
                count++;
            }
            number/=10;

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input number n:");
        int n= r.nextInt();
        long sum=sumOddNumbers(n);

        System.out.printf("\nSum:"+sum);
        System.out.printf("\nNumber odd digits in sum is:"+oddDigits(sum));

    }

}
