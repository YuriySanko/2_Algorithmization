package Algorithmization;

import java.util.Scanner;

public class Task46 {
   public static void simple (int a, int b, int c){
       int check =0;

       Task42 simple = new Task42();
       check = simple.Gcd(simple.Gcd(a,b),c);
       if (check==1){
           System.out.printf("The numbers %d, %d, %d are simple",a,b,c);
       }
       else {
           System.out.printf("The numbers %d, %d, %d are not simple",a,b,c);
       }

   }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input three numbers >0 :");
        int a = r.nextInt();
        int b = r.nextInt();
        int c = r.nextInt();
        simple(a,b,c);



    }
}
