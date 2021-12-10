package lista02;

import java.util.Scanner;
import java.util.Random;

public class zad3 {
    public static int mojSkaner() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        //        System.out.println("n = " + n);
        return skaner.nextInt();
    }

    public static void generateMatrix(int[][] matrix) {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rand.nextInt(50 + 1 - 1) + 1;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("[START]");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                String matrixFormat = String.format("%02d", matrix[i][j]);
                System.out.print(matrixFormat + " ");
            }
            System.out.println();
        }
        System.out.print("[-END-]");
        System.out.println();
    }

    public static int[][] multiplyMatrix(int row1, int col1, int[][] matrixA, int row2, int col2, int[][] matrixB) {
        if (row2 != col1) {
            System.out.println("Multiplication Not Possible");
        }
        int[][] outputMatrix = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++)
                    outputMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
            }
        }
        return outputMatrix;
    }

//    public static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB) {
//        int[][] output = new int[matrixA.length][matrixB.length];
//        for (int i = 0; i < matrixA.length; i++) {
//            for (int j = 0; j < matrixB.length; j++) {
//                output[i][j]=matrixA[]
//            }
//        }
//        return output;
//    }

    public static void main(String[] args) {

        int m = mojSkaner();
        while (!(1 <= m && m <= 10)) {
            System.out.println("1 <= M <= 10");
            m = mojSkaner();
        }

        int n = mojSkaner();
        while (!(1 <= n && n <= 10)) {
            System.out.println("1 <= N <= 10");
            n = mojSkaner();
        }

        int k = mojSkaner();
        while (!(1 <= k && k <= 10)) {
            System.out.println("1 <= K <= 10");
            k = mojSkaner();
        }

        System.out.println("m = " + m + ", n = " + n + ", k = " + k);

        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        System.out.print(a.length + " " + b.length);
        System.out.print(a.length + " " + b.length);
        generateMatrix(a);
        printMatrix(a);
        generateMatrix(b);
        printMatrix(b);

        int[][] c = new int[m][k];
        c = multiplyMatrix(m,n,a,n,k,b);
        printMatrix(c);
    }
}
