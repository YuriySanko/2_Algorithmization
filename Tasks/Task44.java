package Algorithmization;

import java.util.Scanner;

public class Task44 {
    public static double distance(double x1, double y1,double x2, double y2){
        double distance =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return distance;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Input number of points n:");
        int n = r.nextInt();
        double [] x= new double[n];
        double [] y= new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = -10+Math.random() * 20;
            y[i] = -10+Math.random() * 20;
            System.out.printf("Coordinates of pont  %d (%1.2f ; %1.2f) %n",(i+1), x[i], y[i]);
        }
        double maxDistance=0;
        int point1=0;
        int point2=0;
        for (int i=n-1; i>0; i--){
            for (int j=0; j<i;j++){
                distance(x[i],y[i],x[j],y[j]);
                if (maxDistance<distance(x[i],y[i],x[j],y[j])) {
                    maxDistance=distance(x[i],y[i],x[j],y[j]);
                    point1=i; point2=j;
                }
            }
        }

        System.out.printf("Maximum length %2.2f is between points %d and %d %n",maxDistance,point1+1,point2+1);
    }
}
