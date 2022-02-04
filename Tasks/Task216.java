package Algorithmization;

import java.util.Scanner;


public class Task216 {
    private static void printMatrix (int [][] matrix) {
        for (int[] array : matrix) {
            for (int element : array) {
              //  System.out.print( element+"  ");
                System.out.printf("%4d ", element);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input size of magic square N:");
        int n = k.nextInt();//reads count of strings
        int [][] matrix = new int[n][n];
        int [] positiveDiag=new int [n];
        int magicConst=n*(n*n+1)/2;
        if ((n+1)%2==0){
            int magicNumber=(n*n+1)/2;}
        if (n<3) {
            System.out.println("Magic square doesn't exist ");
            System.exit(0);
        }

        if (n % 2 != 0) {
            matrix = oddMagicMatrix(n);

        } else if (n % 4 == 0) {
            matrix = evenMagicMatrix(n);
        }
        else {
            matrix = evenOddMagicMatrix(n);
        }
        System.out.println("Magic square: ");

        printMatrix(matrix);


    }

    private static int [][] oddMagicMatrix (int n) {
        int [][] matrix = new int[n][n];
        int i = 0;
        int j = (n - 1) / 2;
        matrix[i--][j++] = 1;
        for (int c = 2; c <= n * n; i--, j++, c++) {
            if (i < 0 && j > n - 1) {
                i += 2;
                j--;
            }
            if (i < 0)  i = n - 1;
            if (j > n - 1)  j = 0;

            if (matrix[i][j] != 0) {
                i += 2;
                j--;
            }
            matrix[i][j] = c;
        }
        return matrix;
    }

    private static int [][] evenMagicMatrix (int n) {
        int c = 1;
        int [][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = c;
                c++;
            }
        }

        for (int i = 0; i < n; i += 4 ) {
            for (int j = 1; j < n; j += 4) {
                matrix[i][j] = n * n + 1 - matrix[i][j];
                matrix[i + 3][j] = n * n + 1 - matrix[i + 3][j];
                matrix[i][j + 1] = n * n + 1 - matrix[i][j + 1];
                matrix[i + 3][j + 1] = n * n + 1 - matrix[i + 3][j + 1];
            }
        }
        for (int i = 1; i < n; i += 4 ) {
            for (int j = 0; j < n; j += 4) {
                matrix[i][j] = n * n + 1 - matrix[i][j];
                matrix[i + 1][j] = n * n + 1 - matrix[i + 1][j];
                matrix[i][j + 3] = n * n + 1 - matrix[i][j + 3];
                matrix[i + 1][j + 3] = n * n + 1 - matrix[i + 1][j + 3];
            }
        }
        return matrix;
    }

   private static int [][] evenOddMagicMatrix (int n){
        int [][] matrix = new int[n][n];
        int [][] matrixT = evenMagicMatrix(n - 2);
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                matrix[i][j] = matrixT[i - 1][j - 1] + 2 * (n - 1);
            }
        }
        int m = n / 2;
        int d = n * n + 1;

        matrix[0][0] = 3 * m - 1;
        matrix[0][n - 1] = 1;
        matrix[n - 1][0] = d - 1;
        matrix[n - 1][n - 1] = d - 3 * m + 1;

        int i, j;
        for (i = 1; i <= m - 2; i++) {
            matrix[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= m; j++) {
            matrix[0][j + i - 1] = d - 2 * j;
        }
        for (j = 1; j < n - 1; j++) {
            matrix[n - 1][j] = n * n + 1 - matrix[0][j];
        }
        matrix[1][0] = 2 * m - 1;
        for (i = 1; i <= m / 2; i++) {
            matrix[i + 1][0] = 3 * m - 1 - i;
        }
        i--;
        for (j = 1; j <= m / 2 + 1; j++) {
            matrix[i + j + 1][0] = d - 4 * m + 1 + j;
        }
        j--;
        for (int q = 1; q <= m / 2 - 1; q++, i++){
            matrix[i + j + q + 1][0] = 3 * m - 1 + q;
            matrix[i + j + q + 2][0] = d - 2 * m - q;
        }

        for (i = 1; i < n - 1; i++) {
            matrix[i][n - 1] = n * n + 1 - matrix[i][0];
        }

        return matrix;
    }


}
