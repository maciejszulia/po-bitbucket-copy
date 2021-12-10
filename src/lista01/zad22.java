package lista01;

import java.util.Scanner;

public class zad22 {
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
        double[] tablica = new double[n];

        int i = 0, output = 0;
        double wynik = 0;
        while (i != tablica.length) {
            tablica[i] = skaner.nextDouble();
            if (tablica[i]>0)
                wynik += (tablica[i]*2);
            i++;
        }
        System.out.println("Wynik = " + wynik);
    }

}

