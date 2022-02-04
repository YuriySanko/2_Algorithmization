package Algorithmization;
import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input count of numbers:");
        int n = k.nextInt();//reads and assigns count
        System.out.println("Input " + n + "numbers:");
        double[] array = new double[n];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        int numMin = 0;
        int numMax = 0;
        for (int i = 0; i < n; i++) {
            array[i] = k.nextDouble();
            if (min > array[i]) {
                min = array[i];
                numMin = i;
            }
            if (max < array[i]) {
                max = array[i];
                numMax = i;
            }
        }
        array[numMin]=max;
        array[numMax]=min;
        System.out.print(Arrays.toString(array));
    }
}
