package lista01;

import java.util.Scanner;
import java.lang.Math;

public class zad1d {

    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static double dodawanieAbsSqrt(int n) {
        double wynik = 0;
        Scanner scannerDlaDodawania = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaDodawania.nextDouble();
            wynik += Math.sqrt(Math.abs(liczba));
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }


    public static void main(String[] args) {

        int n = skanerDlaLab02();
        double wynikDodawaniaAbsSqrt = dodawanieAbsSqrt(n);

        System.out.println("Wynik dodawania z sqrt(wartosci bezwzglednych) = " + wynikDodawaniaAbsSqrt);
    }
}