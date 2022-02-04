package Algorithmization;

import java.io.IOException;
import java.util.Scanner;

public class Task49 {
    public static double squareQuadrilateral (double x, double y, double z, double t)
            throws IOException
    {double square=0;
        try
        {
            double d = Math.sqrt(x*x+y*y);
            double p= (z+t+d)/2;
            square = (x*y)/2+ Math.sqrt(p*(p-z)*(p-t)*(p-d));
            return square;
        }

    catch (ArithmeticException e) {
        System.out.println("Quadrilateral doesn't exist");
    }
       return square;
    }
    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(System.in);
        System.out.println("Input four size side of Quadrilateral:");
        double a = r.nextDouble();
        double b = r.nextDouble();
        double c = r.nextDouble();
        double d = r.nextDouble();
        System.out.printf("Square is %.3f", squareQuadrilateral(a, b, c, d));
    }

}
