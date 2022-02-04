package Algorithmization;

import java.util.ArrayList;
import java.util.Scanner;

public class Task412 {

    public static ArrayList<Integer> arrayA (int k, int n){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int number=1;
        Task410 arrayNew= new Task410();
        int [] digits;

        while ( number<n){
            digits=arrayNew.arrayDigits(number);
            int sum=0;
            for (int element:digits) {
                sum+=element;
            }
            if (sum==k) arrayList.add(number);
            number++;
        }

        return arrayList;
    }


    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input two numbers:");
        int k= r.nextInt();
        int n= r.nextInt();
        System.out.println(arrayA(k,n));
    }
}
