package lab02;

import java.util.Scanner;
import java.lang.Math;

public class zad1c {

    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static double mnozenieAbs(int n) {
        double wynik = 1;
        Scanner scannerDlaMnozenia = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaMnozenia.nextDouble();
            wynik *= Math.abs(liczba);
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }


    public static void main(String[] args) {

        int n = skanerDlaLab02();
        double wynikMnozeniaAbs = mnozenieAbs(n);

        System.out.println("Wynik mnozenia z wartosci bezwzglednych = " + wynikMnozeniaAbs);
    }
}