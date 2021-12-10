package lista01;


import java.util.Scanner;

public class zad12 {
    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        int n = skanerDlaLab02();
        int i = 0;
        double[] tablica = new double[n];
        while (i != n) {
            tablica[i] = skaner.nextDouble();
            System.out.println(tablica[i]);
            i++;
        }

        i = 1;
        while (i != n - 1) {
            System.out.println(tablica[i]);
            i++;
        }
        System.out.println(tablica[0]);
    }
}
