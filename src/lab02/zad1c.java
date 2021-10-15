package lab02;

import java.util.Scanner;
import java.lang.Math;

public class zad1c {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        int n = scanner.nextInt();
        System.out.println("n = " + n);

        double wynik = 0;
        for (int i = 0; i < n; i++) {
            double liczba = scanner.nextDouble();
            wynik += Math.abs(liczba);
        }
        System.out.println("wynik = " + wynik);
    }
}