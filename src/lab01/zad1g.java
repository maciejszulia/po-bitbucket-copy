package lab01;

import java.util.Scanner;

public class zad1g {

    public static double dodawanie(int n) {
        double wynik = 0;
        Scanner scannerDlaDodawania = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaDodawania.nextDouble();
            wynik += liczba;
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }

    public static double mnozenie(int n) {
        double wynik = 1;
        Scanner scannerDlaMnozenia = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaMnozenia.nextDouble();
            wynik *= liczba;
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }

    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static void main(String[] args) {

        int n = skanerDlaLab02();
        double wynikDodawania = dodawanie(n);
        double wynikMnozenia = mnozenie(n);

        System.out.println("wynik dodawania = " + wynikDodawania + " wynik mnozenia = " + wynikMnozenia);
    }
}