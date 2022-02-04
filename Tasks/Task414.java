package Algorithmization;

import java.util.ArrayList;
import java.util.Scanner;

public class Task414 {
    public static int [] arrayDigits (int n){
        String numberStr= Integer.toString(n);
        int [] array =new int [numberStr.length()];
        for (int i=numberStr.length()-1; i>=0;i--){
            array[i]=n%10;
            n=(int) (n/10);
        }
        return array;
    }

    public static long [] [] arrayPow (){

        long [] [] array =new long [19][9];
        for (int i=0; i<9;i++){
            array[0][i]=i+1;
        }

        for (int i=1; i<19;i++){
            for (int j=0;j<9;j++){
                array[i][j]=array[i-1][j]*(j+1);
            }
        }

        return array;
    }

    public static ArrayList<Integer> arrayArmstrongNumbers (int k){
        ArrayList<Integer> arrayList = new ArrayList<>();
        long [][]array=arrayPow();
        for (int i=1; i<k;i++) {
            int sum = 0;
            int [] digits=arrayDigits(i);
            for (int j = 0; j < digits.length; j++) {
                if (digits[j]!=0) sum+=array[digits.length-1][digits[j]-1];
            }
            if (i==sum) arrayList.add(i);
        }


        return arrayList;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input number k:");
        int k= r.nextInt();

        System.out.println(arrayArmstrongNumbers(k));

    }
}
