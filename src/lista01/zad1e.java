package lista01;

import java.util.Scanner;

public class zad1e {

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
        double wynikMnozenieAbs = mnozenieAbs(n);

        System.out.println("Wynik mnozenia |a1| * |a2| * ... * |an| = " + wynikMnozenieAbs);

    }
}
