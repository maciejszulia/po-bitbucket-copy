package lab02;

import java.util.Scanner;

public class zad1g {

    public static double dodawanie(int n) {
        double wynik = 0;
        Scanner scannerDlaDodawania = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaDodawania.nextDouble();
            wynik +=liczba;
        }
        return wynik;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        int n = scanner.nextInt();
        System.out.println("n = " + n);

        double wynikDodawania = dodawanie(n);
        double wynikMnozenia;

        System.out.println("wynik dodawania = " + wynikDodawania + " wynik mnozenia = ");
    }
}